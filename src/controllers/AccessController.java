package controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import entities.AuthResponse;
import entities.Token;
import entities.AuthUser;
import entities.Foster;
import entities.Volunteer;
import services.FosterBroker;
import services.TokenManager;
import services.VolunteerBroker;

/**
 * @author 794471
 * 
 * REST Controller that handles authentication and provides tokens for access to resources
 * 
 */
@CrossOrigin
@RestController
public class AccessController
{
	@Autowired
	private TokenManager tm;
	
	@Autowired
	private FosterBroker fb;
	
	@Autowired
	private VolunteerBroker vb;
	
	/**
	 * REST endpoint that handles user logins
	 *
	 * @param authUser
	 * @return an AuthResponse object that contains token and user information OR null if the user failed to authenticate 
	 */
	@PostMapping(value = "/login")
	public AuthResponse login(@RequestBody AuthUser authUser)
	{
		AuthResponse ar = new AuthResponse();
		
		Volunteer v = null;
		v = vb.verifyLoginInfo(authUser);
		
		if(v != null)
		{
			ar.setEmail(v.getEmail());
			ar.setId(v.getId() + "");
			
			ar.setRole("regular");
			
			String value = UUID.randomUUID().toString();
			
			ar.setToken(value);

			Calendar c = Calendar.getInstance(TimeZone.getTimeZone("MST"));
			c.add(Calendar.HOUR_OF_DAY, 2);	
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");	
			//sdf.setTimeZone(TimeZone.getTimeZone("MST"));
			
			ar.setExpiresIn(sdf.format(c.getTime()));
			
			Token token = new Token(value, "regular", c);
			tm.addToken(token);
		}
		
		Foster f = null;
		f = fb.verifyLoginInfo(authUser);
		
		if(f != null)
		{
			ar.setEmail(f.getEmail());
			ar.setId(f.getId() + "");
			
			String value = UUID.randomUUID().toString();
			
			ar.setToken(value);

			Calendar c = Calendar.getInstance(TimeZone.getTimeZone("MST"));
			c.add(Calendar.HOUR_OF_DAY, 2);	
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");	
			//sdf.setTimeZone(TimeZone.getTimeZone("MST"));
			
			ar.setExpiresIn(sdf.format(c.getTime()));
			
			Token token = null;
			
			if(f.getEmail().equals("carsadmin-1@calgaryanimalrescue.com") || f.getEmail().equals("carsadmin-2@calgaryanimalrescue.com") || f.getEmail().equals("carsadmin-3@calgaryanimalrescue.com") )
			{
				ar.setRole("admin");
				token = new Token(value, "admin", c);
			}
			else
			{
				ar.setRole("regular");
				token = new Token(value, "regular", c);
			}
			
			tm.addToken(token);
		}
		
		return ar;
	}
	
	/**
	 * REST endpoint that handles user logouts
	 * 
	 * @param tokenValue
	 * @return a String that contains either a success or failure message
	 */
	@PostMapping(value = "/logout")
	public String logout(@RequestHeader("auth-token") String tokenValue)
	{
		String msg = "";
		
		Token token = new Token(tokenValue, null, null);
		
		if(tm.removeToken(token))
		{
			msg = "Logged out.";
		}
		else
		{
			msg = "Error logging out.";
		}
		
		return msg;
	}
	
	/**
	 * Testing method to see if the TokenManger service is working correctly
	 * 
	 * @param tokenValue
	 * @return a String that contains either a success or failure message
	 */
	@PostMapping(value = "/test-token")
	public String foo(@RequestHeader("auth-token") String tokenValue)
	{
		String msg = "";
		
		Token token = new Token(tokenValue, null, null);
		
		if(tm.checkToken(token))
		{
			msg = "Access Granted.";
		}
		else
		{
			msg = "Access Denied.";
		}
		
		return msg;
	}
	
	/**
	 * Testing method that returns the role assigned to a specific token
	 * 
	 * @param tokenValue
	 * @return a String that contains the role of the token sent
	 */
	@GetMapping(value = "/role")
	public String testRole(@RequestHeader("auth-token") String tokenValue)
	{
		
		Token token = new Token(tokenValue, null, null);
		
		String role = tm.getTokenRole(token);
		
		String msg = "";
		
		if(role.equals("admin"))
		{
			msg = "You are an admin.";
		}
		else if(role.equals("regular"))
		{
			msg = "You are a regular user.";
		}
		else
		{
			msg = "You are not permitted to access this resource.";
		}
		
		return msg;
	}
}

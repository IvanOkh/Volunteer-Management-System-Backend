package entities;

/**
 * @author 794471
 *
 * object used to send a response to the frontend after authentication 
 */
public class AuthResponse
{
	private String email;
	private String id;
	private String role;
	private String token;
	private String expiresIn;
	  
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	public String getToken()
	{
		return token;
	}
	
	public void setToken(String token)
	{
		this.token = token;
	}
	
	public String getExpiresIn()
	{
		return expiresIn;
	}
	
	public void setExpiresIn(String expiresIn)
	{
		this.expiresIn = expiresIn;
	}
}

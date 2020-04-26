package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import services.EmailBroker;

/**
 * @author 794471
 * 
 * REST controller that handles email operations
 *
 */
@CrossOrigin
@RestController
public class EmailController 
{
	@Autowired
	private EmailBroker eb;
	
	/**
	 * sends a confirmation email to the passed email address
	 * 
	 * @param email
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/email/confirmation/volunteer")
	public String sendConfirmEmailV(@RequestBody String email) 
	{
		boolean success = eb.sendConfirmation(email, "volunteer");
		
		if(success)
		{
			return "Email sent.";
		}
		
		return "Error sending email.";
	}
	
	/**
	 * sends a confirmation email to the passed email address
	 * 
	 * @param email
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/email/confirmation/foster")
	public String sendConfirmEmailF(@RequestBody String email) 
	{
		boolean success = eb.sendConfirmation(email, "foster");
		
		if(success)
		{
			return "Email sent.";
		}
		
		return "Error sending email.";
	}
	
	/**
	 * sends a confirmation email to the passed email address
	 * 
	 * @param email
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/email/confirmation/dog")
	public String sendConfirmEmailD(@RequestBody String email) 
	{
		boolean success = eb.sendConfirmation(email, "dog");
		
		if(success)
		{
			return "Email sent.";
		}
		
		return "Error sending email.";
	}
	
	/**
	 * sends a confirmation email to the passed email address
	 * 
	 * @param email
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/email/confirmation/cat")
	public String sendConfirmEmailC(@RequestBody String email) 
	{
		boolean success = eb.sendConfirmation(email, "cat");
		
		if(success)
		{
			return "Email sent.";
		}
		
		return "Error sending email.";
	}
	
	/**
	 * sends a welcome email to the passed email address
	 * 
	 * @param email
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/email/welcome/volunteer")
	public String sendWelcomeEmailV(@RequestBody String email)
	{
		boolean success = eb.sendWelcome(email, "volunteer");
		
		if(success)
		{
			return "Email sent.";
		}
		
		return "Error sending email.";
	}
	
	/**
	 * sends a welcome email to the passed email address
	 * 
	 * @param email
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/email/welcome/foster")
	public String sendWelcomeEmailF(@RequestBody String email)
	{
		boolean success = eb.sendWelcome(email, "volunteer");
		
		if(success)
		{
			return "Email sent.";
		}
		
		return "Error sending email.";
	}
	
	/**
	 * sends a reset email to the passed email address
	 * 
	 * @param email
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/email/reset/{uuid}")
	public String resetPassword(@PathVariable(value = "uuid") String uuid, @RequestBody String email)
	{
		//TODO
		return "";
	}
}

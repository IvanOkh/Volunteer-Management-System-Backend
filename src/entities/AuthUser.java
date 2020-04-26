package entities;

/**
 * @author 794471
 *
 * object used to recieve an email and password from the frontend
 */
public class AuthUser
{
	private String email;
	private String password;
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
}

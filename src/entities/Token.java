package entities;

import java.util.Calendar;

/**
 * @author 794471
 *
 * class that tracks the unique value given to an authenticated user as well as the role and time the token expires
 */
public class Token
{
	private String value;
	private String role;
	private Calendar expireTime;
	
	public Token(String value, String role, Calendar expireTime)
	{
		this.value = value;
		this.role = role;
		this.expireTime = expireTime;
	}

	public String getValue()
	{
		return value;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	public Calendar getExpireTime()
	{
		return expireTime;
	}
	
	public void setExpireTime(Calendar expireTime)
	{
		this.expireTime = expireTime;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		
		if (obj == null)
		{
			return false;
		}
		
		if (getClass() != obj.getClass())
		{
			return false;
		}
		
		Token other = (Token) obj;
		
		if (value == null)
		{
			if (other.value != null)
			{
				return false;
			}
		} 
		else if (!value.equals(other.value))
		{
			return false;
		}
		
		return true;
	}
}

package services;

import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.stereotype.Service;

import entities.Token;

/**
 * @author 794471
 * 
 * Service class that manages authentication tokens
 */
@Service
public class TokenManager implements Runnable
{
	private ArrayList<Token> tokens;
	
	/**
	 * default constructor that starts the thread upon object creation
	 */
	public TokenManager()
	{
		tokens = new ArrayList<Token>();
		
		Thread t = new Thread(this);
		t.start();
	}
	
	/**
	 * adds the passed token to the list
	 * 
	 * @param token
	 * @return always returns true
	 */
	public synchronized boolean addToken(Token token)
	{
		tokens.add(token);
		
		return true;
	}
	
	/**
	 * removes the specified token from the list
	 * 
	 * @param token
	 * @return true if the token was found and removed else false
	 */
	public synchronized boolean removeToken(Token token)
	{
		return tokens.remove(token);
	}
	
	/**
	 * checks the list for a specified token
	 * 
	 * @param token
	 * @return true if the token exists in the list else false
	 */
	public boolean checkToken(Token token)
	{
		return tokens.contains(token);
	}
	
	/**
	 * returns the role of a supplied token
	 * 
	 * @param token
	 * @return the role of the token if found
	 */
	public String getTokenRole(Token token)
	{
		int index = tokens.indexOf(token); 
		
		if(index == -1)
		{
			return "No token.";
		}
		
		return tokens.get(index).getRole();
	}

	/**
	 * checks the list for expired tokens every 15 minutes
	 * 
	 */
	@Override
	public void run()
	{
		while(true)
		{
			if(tokens.size() > 0)
			{
				for(int i = 0; i < tokens.size(); i++)
				{
					if(Calendar.getInstance().compareTo(tokens.get(i).getExpireTime()) > 0)
					{
						synchronized(this)
						{
							tokens.remove(tokens.get(i));
							i--;
						}
					}
				}
			}
			
			
			try
			{
				Thread.sleep(900000);
			} 
			catch (InterruptedException e)
			{
				System.out.println("Error in thread execution.");
			}
		}
	}
}

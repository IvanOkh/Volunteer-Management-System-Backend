package services;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.CatApplication;

/**
 * Broker class for managing cat application.
 */
@Service
public class CatAppBroker
{
	/**
	 * variable to access the database.
	 */
	@Autowired
	private DBUtil db;
	
	/**
	 * Method to get the list of the cat after called.
	 * 
	 * @return list of the cats.
	 */
	public List<CatApplication> getCatApplications()
	{
		Session session = null; 
		
		List<CatApplication> catapps = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
		
			session.beginTransaction();
		
			catapps = session.createQuery("from CatApplication").getResultList();
		}
		catch(Exception e) 
		{
			System.out.println("Error in getCatApplications.");
		}
		finally
		{
			session.close();
		}

		return catapps;
	}
	
	/**
	 * Get the cats by their ID.
	 * 
	 * @param cat's id 
	 * @return the list of cat after the method search using cat's id.
	 */
	public List<CatApplication> getCatApplicationByID(String id)
	{
		Session session = null; 
		
		List<CatApplication> catapps = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
		
			session.beginTransaction();
		
			catapps = session.createQuery("from CatApplication c where c.id = " + id).getResultList();
		}
		catch(Exception e) 
		{
			System.out.println("Error in getCatApplicationsByID.");
		}
		finally
		{
			session.close();
		}

		return catapps;
	}
	
	/**
	 * Add a new cat to database.
	 * 
	 * @param catApplication object.
	 * @return true if a new cat added successfully.
	 */
	public boolean addCatApplication(CatApplication catApplication)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			session.beginTransaction();
			
			session.save(catApplication);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in addCatApplication.");
		}
		finally
		{
			session.close();
		}

		return success;
	}
	
	/**
	 * Delete an existing cat from database.
	 * 
	 * @param catApplication object.
	 * @return true if the cat is deleted successfully.
	 */
	public boolean deleteCatApplication(CatApplication catApplication)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			session.beginTransaction();
			
			session.delete(catApplication);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in deleteCatApplication.");
		}
		finally
		{
			session.close();
		}

		return success;
	}
}

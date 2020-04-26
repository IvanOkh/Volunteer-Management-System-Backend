package services;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.DogApplication;

/**
 * Broker class for managing dog application.
 */
@Service
public class DogAppBroker
{
	/**
	 * variable to access the database.
	 */
	@Autowired
	private DBUtil db;
	
	/**
	 * Method to get the list of the dog after called.
	 * 
	 * @return list of the dogs.
	 */
	public List<DogApplication> getDogApplications()
	{
		Session session = null; 
		
		List<DogApplication> dogapps = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			dogapps = session.createQuery("from DogApplication").getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getDogApplications.");
		}
		finally
		{
			session.close();
		}

		return dogapps;
	}

	/**
	 * Get the dogs by their ID.
	 * 
	 * @param dog's id 
	 * @return the list of dog after the method search using dog's id.
	 */
	public List<DogApplication> getDogApplicationByID(String id)
	{
		Session session = null; 
		
		List<DogApplication> dogapps = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			dogapps = session.createQuery("from DogApplication d where d.id = " + id).getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getDogApplicationByID.");
		}
		finally
		{
			session.close();
		}

		return dogapps;
	}
	
	/**
	 * Add a new dog to database.
	 * 
	 * @param dogApplication object.
	 * @return true if a new dog added successfully.
	 */
	public boolean addDogApplication(DogApplication dogApplication)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			session.beginTransaction();
			
			session.save(dogApplication);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in addDogApplication.");
		}
		finally
		{
			session.close();
		}

		return success;
	}

	/**
	 * Delete an existing dog from database.
	 * 
	 * @param dogApplication object.
	 * @return true if the dog is deleted successfully.
	 */
	public boolean deleteDogApplication(DogApplication dogApplication)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			session.beginTransaction();
			
			session.delete(dogApplication);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in deleteDogApplication.");
		}
		finally
		{
			session.close();
		}

		return success;
	}
}

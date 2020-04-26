package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.AuthUser;
import entities.CARSID;
import entities.Foster;

/**
 * Broker class for managing foster.
 */
@Service
public class FosterBroker
{
	/**
	 * Variable to access the database.
	 */
	@Autowired
	private DBUtil db;
	
	/**
	 * Return the list of the fosters.
	 * 
	 * @return the list of fosters after the method called.
	 */
	public List<Foster> getFosters()
	{
		Session session = null; 
		
		List<Foster> fosters = null;	
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			fosters = session.createQuery("from Foster").getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getFosters.");
		}
		finally
		{
			session.close();
		}
		
		return fosters;
	}

	/**
	 * Get the foster by their id.
	 * 
	 * @param foster's id.
	 * @return the list of fosters after the method search using foster's id.
	 */
	public List<Foster> getFosterByID(String id)
	{
		Session session = null; 	
		
		List<Foster> fosters = null; 
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			fosters = session.createQuery("from Foster f where f.id = " + id).getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getFosterByID.");
		}
		finally 
		{
			session.close();
		}

		return fosters;
	}

	/**
	 * Add a new foster.
	 * 
	 * @param a foster object.
	 * @return true if adding a new foster successfully.
	 */
	public boolean addFoster(Foster foster)
	{
		foster.setActive(false);
		foster.setApproved(false);
		foster.setPassword(null);
		
		CARSID cid = new CARSID();
		cid.setType("foster");
		
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.save(cid);

			int id = (int) session.createQuery("select max(id) from CARSID").getResultList().get(0);	
			foster.setId(id);
			
			session.save(foster);
			
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in addFoster.");
		}
		finally 
		{
			session.close();
		}

		return success;
	}

	/**
	 * Update foster 
	 * 
	 * @param a foster object
	 * @return true if updating an existing foster successfully.
	 */
	public boolean updateFoster(Foster foster)
	{
		Session session = null;
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			session.merge(foster);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in updateFoster.");
		}
		finally 
		{
			session.close();
		}

		return success;
	}

	/**
	 * Delete a foster
	 * 
	 * @param a foster object
	 * @return true if deleting an existing foster successfully	
	 */
	public boolean deleteFoster(Foster foster)
	{
		CARSID cid = new CARSID();
		cid.setType("foster");
		cid.setId(foster.getId());
		
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			session.delete(foster);
			session.delete(cid);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in deleteFoster.");
		}
		finally
		{
			session.close();
		}
		
		return success;
	}

	/**
	 * Verify the foster's information for loging in.
	 * 
	 * @param an authUser object
	 * @return a foster object if matched.
	 */
	public Foster verifyLoginInfo(AuthUser authUser)
	{
		Session session = null;
		
		Foster foster = null;

		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			Query query = session.createQuery("from Foster f where f.email = :email AND f.password = :password");
			
			query.setParameter("email", authUser.getEmail());
			query.setParameter("password", authUser.getPassword());
			
			List<Foster> results = query.getResultList();
			
			if(results.size() == 1)
			{
				foster = results.get(0);
			}
			else
			{
				foster = null;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in verifyLoginInfo");
		}
		finally
		{
			session.close();
		}
		
		return foster;
	}
}

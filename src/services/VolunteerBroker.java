package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.CARSID;
import entities.AuthUser;
import entities.Volunteer;

/**
 * Broker class for managing volunteer
 */
@Service
public class VolunteerBroker
{
	/**
	 * variable to access the database.
	 */
	@Autowired
	private DBUtil db;
	
	/**
	 * Return the list of the volunteers
	 * 
	 * @return the list of volunteer after the method called.
	 */
	public List<Volunteer> getVolunteers()
	{
		Session session = null; 
		
		List<Volunteer> volunteers = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			volunteers = session.createQuery("from Volunteer").getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getVolunteers.");
		}
		finally
		{
			session.close();
		}

		return volunteers;
	}
	
	/**
	 * Get the volunteer by their ID.
	 * 
	 * @param volunteer's id 
	 * @return the list of volunteer after the method search using volunteer's id.
	 */
	public List<Volunteer> getVolunteerByID(String id)
	{
		Session session = null; 

		List<Volunteer> volunteers = null; 
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			volunteers = session.createQuery("from Volunteer v where v.id = " + id).getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getVolunteersByID.");
		}
		finally
		{
			session.close();
		}
		
		return volunteers;
	}

	/**
	 * Add a new volunteer
	 * 
	 * @param a volunteer object
	 * @return true if adding a new volunteer successfully.
	 */
	public boolean addVolunteer(Volunteer volunteer)
	{
		// might move this code out to the controller
		volunteer.setPassword(null);
		volunteer.setActive(false);
		volunteer.setApproved(false);
		
		boolean success = false;
		
		CARSID cid = new CARSID();
		cid.setType("volunteer");
		
		Session session = null; 
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.save(cid);

			int id = (int) session.createQuery("select max(id) from CARSID").getResultList().get(0);
			volunteer.setId(id);
			
			session.save(volunteer);
			
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in addVolunteer.");
		}
		finally
		{
			session.close();
		}
		
		return success;
	}
	
	/**
	 * Update volunteer 
	 * 
	 * @param a volunteer object
	 * @return true if updating an existing volunteer successfully.
	 */
	public boolean updateVolunteer(Volunteer volunteer)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			session.merge(volunteer);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in updateVolunteer.");
		}
		finally
		{
			session.close();
		}

		return success;
	}

	/**
	 * Delete a volunteer
	 * 
	 * @param a volunteer object
	 * @return true if deleting an existing volunteer successfully	
	 */
	public boolean deleteVolunteer(Volunteer volunteer)
	{
		CARSID cid = new CARSID();
		cid.setType("volunteer");
		cid.setId(volunteer.getId());
		
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			session.delete(volunteer);
			session.delete(cid);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in deleteVolunteer.");
		}
		finally
		{
			session.close();
		}
	
		return success;
	}

	/**
	 * Check the volunteer using their email.
	 * 
	 * @param a volunteer's email.
	 * @return true if the volunteer exists.
	 */
	public boolean checkVolunteerEmail(String email)
	{
		Session session = null;
		
		boolean exists = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			List<Volunteer> volunteers = session.createQuery("from Volunteer v where v.email = " + email).getResultList();
			
			if(volunteers.size() > 0)
			{
				exists = true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in checkVolunteerEmail.");
		}
		finally
		{
			session.close();
		}
		
		return exists;
	}

	/**
	 * Verify the volunteer's information for loging in.
	 * 
	 * @param an authUser object
	 * @return a volunteer object if matched.
	 */
	public Volunteer verifyLoginInfo(AuthUser authUser)
	{
		Session session = null;
		
		Volunteer volunteer = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			Query query = session.createQuery("from Volunteer v where v.email = :email AND v.password = :password");
			
			query.setParameter("email", authUser.getEmail());
			query.setParameter("password", authUser.getPassword());
			
			List<Volunteer> results = query.getResultList();
							
			if(results.size() == 1)
			{
				volunteer = results.get(0);
			}
			else
			{
				volunteer = null;
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
		
		return volunteer;
	}
	
}

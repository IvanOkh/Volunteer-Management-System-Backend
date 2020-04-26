package services;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Event;
import entities.EventStaff;

/**
 * Borker class for managing event.
 */
@Service
public class EventBroker
{
	/**
	 * variable to access the database.
	 */
	@Autowired
	private DBUtil db;
	
	/**
	 * Return the list of the events
	 * 
	 * @return the list of events after the method called.
	 */
	public List<Event> getEvents()
	{
		Session session = null; 
		
		List<Event> events = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
		
			session.beginTransaction();
		
			events = session.createQuery("from Event").getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getEvents.");
		}
		finally 
		{
			session.close();
		}
		
		return events;
	}

	/**
	 * Get the event by using the event's ID.
	 * 
	 * @param event's id 
	 * @return the list of event after the method search using event's id.
	 */
	public List<Event> getEventByID(String id)
	{
		Session session = null; 
		
		List<Event> events = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
		
			session.beginTransaction();
		
			events = session.createQuery("from Event e where e.id = " + id).getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getEventByID.");
		}
		finally 
		{
			session.close();
		}
		
		return events;
	}

	/**
	 * Add a new event
	 * 
	 * @param a event object
	 * @return true if adding a new event successfully.
	 */
	public boolean addEvent(Event event)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.save(event);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in addEvent.");
		}
		finally
		{
			session.close();
		}

		return success;
	}

	/**
	 * Update event 
	 * 
	 * @param a event object
	 * @return true if updating an existing event successfully.
	 */
	public boolean updateEvent(Event event)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.merge(event);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in updateEvent.");
		}
		finally
		{
			session.close();
		}

		return success;
	}

	/**
	 * Delete a event. 
	 * 
	 * @param a event object
	 * @return true if updating an existing event successfully.
	 */
	public boolean deleteEvent(Event event)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.delete(event);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in deleteEvent.");
		}
		finally
		{
			session.close();
		}

		return success;
	}

	/**
	 * Assign staff for the event
	 * 
	 * @param evenStaff object
	 * @return true if adding the staff to event successfully.
	 */
	public boolean addEventStaff(EventStaff eventstaff)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.save(eventstaff);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in addEventStaff.");
		}
		finally
		{
			session.close();
		}

		return success;
	}

	/**
	 * Delete a staff from the event.
	 * 
	 * @param eventStaff object.
	 * @return true if delete the staff from the event successfully.
	 */
	public boolean deleteEventStaff(EventStaff eventstaff)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			int row = session.createQuery("delete from EventStaff where eventid = " + eventstaff.getEventid() + 
					" AND staffid = " + eventstaff.getStaffid()).executeUpdate();
			
			session.getTransaction().commit();
			
			if(row > 0)
			{
				success = true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in deleteEventStaff.");
		}
		finally
		{
			session.close();
		}

		return success;
	}

	/**
	 * Get all the events and staffs.
	 * 
	 * @return the list of the staffs from its event.
	 */
	public List<EventStaff> getAllEventsAndStaff()
	{
		Session session = null; 
		
		List<EventStaff> eventstaff = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
		
			session.beginTransaction();
		
			eventstaff = session.createQuery("from EventStaff").getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getAllEventsAndStaff.");
		}
		finally 
		{
			session.close();
		}
		
		return eventstaff;
	}

	/**
	 * Get the event which is assigned to the staff using staff's id.
	 * 
	 * @param staff's id
	 * @return the list of the event using staff's id.
	 */
	public List<EventStaff> getEventsByStaffID(String id)
	{
		Session session = null; 
		
		List<EventStaff> eventstaff = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
		
			session.beginTransaction();
		
			eventstaff = session.createQuery("from EventStaff e where e.staffid = " + id).getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getEventsByStaffID.");
		}
		finally 
		{
			session.close();
		}
		
		return eventstaff;
	}

	/**
	 * Get the staff which is assigned to the event using event's id.
	 * 
	 * @param event's id
	 * @return the list of the staff assign to that event using staff's id.
	 */
	public List<EventStaff> getStaffByEventID(String id)
	{
		Session session = null; 
		
		List<EventStaff> eventstaff = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
		
			session.beginTransaction();
		
			eventstaff = session.createQuery("from EventStaff e where e.eventid = " + id).getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getStaffByEventID.");
		}
		finally 
		{
			session.close();
		}
		
		return eventstaff;
	}
}

package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.Event;
import entities.EventStaff;
import services.EventBroker;

/**
 * @author 794471
 * 
 * REST controller that handles event operations
 *
 */
@CrossOrigin
@RestController
public class EventController
{
	@Autowired
	private EventBroker eb;
	
	/**
	 * returns all events in the database
	 * 
	 * @return a list of events
	 */
	@GetMapping(value = "/events")
	public List<Event> showEvents()
	{
		return eb.getEvents();
	}
	
	/**
	 * returns a list with one event based on the id
	 * 
	 * @param id
	 * @return a list with one event
	 */
	@GetMapping(value = "/events/{id}")
	public List<Event> showEvent(@PathVariable(value = "id") String id)
	{
		return eb.getEventByID(id);
	}
	
	/**
	 * accepts an event that is to be saved to the database
	 * 
	 * @param event
	 * @return a message based on the outcome of the operation 
	 */
	@PostMapping(value = "/events")
	public String addEvent(@RequestBody Event event)
	{
		boolean success = eb.addEvent(event);
		
		if(success)
		{
			return "Event added.";
		}
		
		return "Error adding event.";
	}
	
	/**
	 * accepts an event that is to be updated in the database
	 * 
	 * @param event
	 * @return a message based on the outcome of the operation
	 */
	@PatchMapping(value = "/events")
	public String editEvent(@RequestBody Event event)
	{
		boolean success = eb.updateEvent(event);
		
		if(success)
		{
			return "Event added.";
		}
		
		return "Error editing event.";
	}
	
	/**
	 * deletes an event from the database based on the id
	 * 
	 * @param id
	 * @return a message based on the outcome of the operation
	 */
	@DeleteMapping(value = "/events/{id}")
	public String deleteEvent(@PathVariable(value = "id") String id)
	{
		List<Event> events = eb.getEventByID(id);
		boolean success = false; 
		
		if(events.size() == 1)
		{
			success = eb.deleteEvent(events.get(0));
		}
		
		if(success)
		{
			return "Event added.";
		}
		
		return "Error deleting event.";
	}
	
	/**
	 * returns a list of all eventstaff
	 * 
	 * @return a list of eventstaff
	 */
	@GetMapping(value = "/event-info")
	public List<EventStaff> getAllEventsAndStaff()
	{
		return eb.getAllEventsAndStaff();
	}
	
	/**
	 * returns a list of eventstaff based on the staff id 
	 * 
	 * @param id
	 * @return a list of eventstaff
	 */
	@GetMapping(value = "/event-info/staff/{id}")
	public List<EventStaff> getAllEventsByStaffId(@PathVariable(value = "id") String id)
	{
		return eb.getEventsByStaffID(id);
	}
	
	/**
	 * returns a list of eventstaff based on the event id
	 * 
	 * @param id
	 * @return a list of eventstaff
	 */
	@GetMapping(value = "/event-info/event/{id}")
	public List<EventStaff> getAllStaffByEventID(@PathVariable(value = "id") String id)
	{
		return eb.getStaffByEventID(id);
	}
	
	/**
	 * accepts an eventstaff object and saves it to the database
	 * 
	 * @param eventstaff
	 * @return a message based on the outcome of the operation
	 */
	@PostMapping(value = "/event-info")
	public String registerForEvent(@RequestBody EventStaff eventstaff)
	{
		boolean success = eb.addEventStaff(eventstaff);
		
		if(success)
		{
			return "Registered for event.";
		}
		
		return "Error registering for event.";
	}
	
	/**
	 * deletes an eventstaff based on the passed event id and staff id
	 * 
	 * @param eventid
	 * @param staffid
	 * @return a message based on the outcome of the operation
	 */
	@DeleteMapping(value = "/event-info/{eventid}/{staffid}")
	public String unregisterForEvent(@PathVariable(value = "eventid") String eventid, @PathVariable(value = "staffid") String staffid)
	{
		EventStaff eventstaff = new EventStaff();
		
		boolean success = false;
		
		try
		{
			eventstaff.setEventid(Integer.valueOf(eventid));
			eventstaff.setStaffid(Integer.valueOf(staffid));
			
			success = eb.deleteEventStaff(eventstaff);
		}
		catch(NumberFormatException e)
		{
			success = false;
			System.out.println("Error in EventController.");
		}
		
		
		if(success)
		{
			return "Unregistered for event.";
		}
		
		return "Error unregistering for event.";
	}
}

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

import services.VolunteerBroker;
import entities.*;

/**
 * @author 794471
 *
 * REST controller that handles volunteer requests
 */
@CrossOrigin
@RestController
public class VolunteerController
{
	@Autowired
	private VolunteerBroker vb;
	
	/**
	 * returns a list of all volunteers in the database
	 * 
	 * @return a list of type volunteer
	 */
	@GetMapping(value = "/volunteers")
	public List<Volunteer> showVolunteers()
	{
		return vb.getVolunteers();
	}
	
	/**
	 * returns a list with one volunteer based on id
	 * 
	 * @param id
	 * @return a list of type volunteer
	 */
	@GetMapping(value = "/volunteers/{id}")
	public List<Volunteer> showVolunteer(@PathVariable(value = "id") String id)
	{
		return vb.getVolunteerByID(id);
	}
	
	@PostMapping(value = "/volunteer/email")
	public String checkEmail(@RequestBody String email)
	{
		boolean exists = vb.checkVolunteerEmail(email);
		
		if(!exists)
		{
			return "Email does not exist.";
		}
		
		return "Email exists.";
	}
	
	/**
	 * accepts a volunteer that is saved to the database
	 * 
	 * @param volunteer
	 * @return a message based on the outcome of the operation
	 */
	@PostMapping(value = "/volunteers")
	public String addVolunteer(@RequestBody Volunteer volunteer)
	{
		boolean success = vb.addVolunteer(volunteer);
		
		if(success)
		{
			return "Volunteer added.";
		}
		
		return "Error adding volunteer.";
	}
	
	/**
	 * accepts a volunteer that is to be updated in the database 
	 * 
	 * @param volunteer
	 * @return a message based on the outcome of the operation
	 */
	@PatchMapping(value = "/volunteers")
	public String editVolunteer(@RequestBody Volunteer volunteer)
	{
		boolean success = vb.updateVolunteer(volunteer);
		
		if(success)
		{
			return "Volunteer edited.";
		}
		
		return "Error editing volunteer.";
	}
	
	/**
	 * deletes a volunteer from the database based on the id
	 * 
	 * @param id
	 * @return a message based on the outcome of the operation
	 */
	@DeleteMapping(value = "/volunteers/{id}")
	public String deleteVolunteer(@PathVariable(value = "id") String id)
	{
		List<Volunteer> volunteers = vb.getVolunteerByID(id);
		boolean success = false ;
		
		if(volunteers.size() == 1)
		{
			success = vb.deleteVolunteer(volunteers.get(0));
		}
			
		if(success)
		{
			return "Volunteer deleted.";
		}
		
		return "Error deleting volunteer.";
	}
}

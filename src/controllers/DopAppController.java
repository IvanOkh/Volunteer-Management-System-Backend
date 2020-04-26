package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.DogApplication;
import services.DogAppBroker;

/**
 * @author 794471
 *
 * REST Controller that provides dog application resources 
 * 
 */
@CrossOrigin
@RestController
public class DopAppController
{
	@Autowired
	private DogAppBroker dab;
	
	/**
	 * returns a list with all the dog applications in the database
	 * 
	 * @return a list of all god applications
	 */
	@GetMapping(value = "/dogs")
	public List<DogApplication> showVolunteers()
	{
		return dab.getDogApplications();
	}
	
	/**
	 * REST endpoint that accepts a new dog application and saves it to the database
	 * 
	 * @param dogApp
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/dogs")
	public String addDogApplication(@RequestBody DogApplication dogApp)
	{
		 boolean success = dab.addDogApplication(dogApp);
		 
		 if(success)
		 {
			 return "Application added.";
		 }
		 
		 return "Error adding application.";
	}
	
	/**
	 * REST endpoint that accepts an id value and deletes an application based on the id
	 * 
	 * @param id
	 * @return a message based on the success of the operation
	 */
	@DeleteMapping(value = "/dogs/{id}")
	public String deleteDogApplication(@PathVariable(value = "id") String id)
	{
		List<DogApplication> dogapps = dab.getDogApplicationByID(id);
		
		boolean success = false;
		
		if(dogapps.size() != 0)
		{
			success = dab.deleteDogApplication(dogapps.get(0));
		}
		
		if(success)
		{
			return "Application deleted.";
		}
		 
		return "Error deleting application.";
	}
}

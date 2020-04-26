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

import entities.Foster;
import services.FosterBroker;

/**
 * @author 794471
 *
 * REST controller that handles foster requests
 */
@CrossOrigin
@RestController
public class FosterController
{
	@Autowired
	private FosterBroker fb;
	
	/**
	 * returns a list of all fosters in the database
	 * 
	 * @return a list of type foster
	 */
	@GetMapping(value = "/fosters")
	public List<Foster> showFosters()
	{
		return fb.getFosters();
	}
	
	/**
	 * returns a list with one foster based on id
	 * 
	 * @param id
	 * @return a list of type foster
	 */
	@GetMapping(value = "/fosters/{id}")
	public List<Foster> showFoster(@PathVariable(value = "id") String id)
	{
		return fb.getFosterByID(id);
	}
	
	/**
	 * accepts a foster that is saved to the database
	 * 
	 * @param foster
	 * @return a message based on the outcome of the operation
	 */
	@PostMapping(value = "/fosters")
	public String addFoster(@RequestBody Foster foster)
	{
		boolean success = fb.addFoster(foster);
		
		if(success)
		{
			return "Foster added.";
		}
		
		return "Error adding foster.";
	}
	
	/**
	 * accepts a foster that is to be updated in the database 
	 * 
	 * @param foster
	 * @return a message based on the outcome of the operation
	 */
	@PatchMapping(value = "/fosters")
	public String editFoster(@RequestBody Foster foster)
	{
		boolean success = fb.updateFoster(foster);
		
		if(success)
		{
			return "Foster edited.";
		}
		
		return "Error editing foster.";
	}
	
	/**
	 * deletes a foster from the database based on the id
	 * 
	 * @param id
	 * @return a message based on the outcome of the operation
	 */
	@DeleteMapping(value = "/fosters/{id}")
	public String deleteFoster(@PathVariable(value = "id") String id)
	{
		List<Foster> fosters = fb.getFosterByID(id);
		boolean success = false; 
		
		if(fosters.size() == 1)
		{
			success = fb.deleteFoster(fosters.get(0));
		}
			
		if(success)
		{
			return "Foster deleted.";
		}
		
		return "Error deleteing foster.";
	}
}

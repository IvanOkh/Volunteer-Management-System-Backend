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

import entities.CatApplication;
import services.CatAppBroker;

/**
 * @author 794471
 *
 * REST Controller that provides cat application resources 
 * 
 */
@CrossOrigin
@RestController
public class CatAppController
{
	@Autowired
	private CatAppBroker cab;
	
	/**
	 * returns a list with all the cat applications in the database
	 * 
	 * @return a list of all cat applications
	 */
	@GetMapping(value = "/cats")
	public List<CatApplication> showCatApplications()
	{
		return cab.getCatApplications();
	}
	
	/**
	 * REST endpoint that accepts a new cat application and saves it to the database
	 * 
	 * @param catApp
	 * @return a message based on the success of the operation
	 */
	@PostMapping(value = "/cats")
	public String addCatApplication(@RequestBody CatApplication catApp)
	{
		 boolean success = cab.addCatApplication(catApp);
		 
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
	@DeleteMapping(value = "/cats/{id}")
	public String deleteCatApplication(@PathVariable(value = "id") String id)
	{
		List<CatApplication> catapps = cab.getCatApplicationByID(id);
		
		boolean success = false;
		
		if(catapps.size() != 0)
		{
			success = cab.deleteCatApplication(catapps.get(0));
		}
		
		if(success)
		{
			return "Application deleted.";
		}
		 
		return "Error deleting application.";
	}
}

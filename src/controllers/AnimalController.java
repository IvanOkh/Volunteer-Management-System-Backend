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

import entities.Animal;
import services.AnimalBroker;

/**
 * @author 794471
 * 
 * REST Controller that provides animal resources 
 *
 */
@CrossOrigin
@RestController
public class AnimalController
{
	@Autowired
	private AnimalBroker ab;
	
	/**
	 * REST endpoint that returns a list of all animals in the database
	 * 
	 * @return a list of all animals in the database
	 */
	@GetMapping(value = "/animals")
	public List<Animal> showAnimals()
	{
		return ab.getAnimals();
	}
	
	/**
	 * REST endpoint that returns a list that contains an animal based on the id
	 * 
	 * @param id
	 * @return a list with one animal
	 */
	@GetMapping(value = "/animals/{id}")
	public List<Animal> showAnimal(@PathVariable(value = "id") String id)
	{
		return ab.getAnimalByID(id);
	}
	
	/**
	 * REST endpoint that persists a new animal into the database
	 * 
	 * @param animal
	 * @return a String based on if the operation was successful or not
	 */
	@PostMapping(value = "/animals")
	public String addAnimal(@RequestBody Animal animal)
	{
		boolean success = ab.addAnimal(animal);
		
		if(success)
		{
			return "Animal added.";
		}
		
		return "Error adding animal.";
	}
	
	/**
	 * REST endpoint that updates an animal in the database
	 * 
	 * @param animal
	 * @return a String based on if the operation was successful or not
	 */
	@PatchMapping(value = "/animals")
	public String editAnimal(@RequestBody Animal animal)
	{
		boolean success = ab.updateAnimal(animal);
		
		if(success)
		{
			return "Animal edited.";
		}
		
		return "Error editing animal.";
	}
	
	/**
	 * REST endpoint that deletes an animal from the database based on the id
	 * 
	 * @param id
	 * @return a String based on if the operation was successful or not
	 */
	@DeleteMapping(value = "/animals/{id}")
	public String deleteAnimal(@PathVariable(value = "id") String id)
	{
		List<Animal> animals = ab.getAnimalByID(id);
		boolean success = false; 
		
		if(animals.size() == 1)
		{	
			success = ab.deleteAnimal(animals.get(0));
		}
			
		if(success)
		{
			return "Animal deleted.";
		}
		
		return "Error deleting animal.";
	}
}

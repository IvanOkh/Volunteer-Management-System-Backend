package services;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Animal;

/**
 * Broker class for managing animals.
 */
@Service
public class AnimalBroker
{
	/**
	 * variable to access the database.
	 */
	@Autowired
	private DBUtil db;

	/**
	 * Method to get the list of the animal after called.
	 * 
	 * @return list of the animals.
	 */
	public List<Animal> getAnimals()
	{
		Session session = null; 
		
		List<Animal> animals = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			animals = session.createQuery("from Animal").getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getAnimals.");
		}
		finally
		{
			session.close();
		}
		
		return animals;
	}

	/**
	 * Get the animals by their ID.
	 * 
	 * @param animal's id 
	 * @return the list of animal after the method search using animal's id.
	 */
	public List<Animal> getAnimalByID(String id)
	{
		Session session = null; 
		
		List<Animal> animals = null;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			animals = session.createQuery("from Animal a where a.id = " + id).getResultList();
		}
		catch(Exception e)
		{
			System.out.println("Error in getAnimalByID.");
		}
		finally
		{
			session.close();
		}
		
		return animals;
	}

	/**
	 * Add a new animal to database.
	 * 
	 * @param animalApplianimalion object.
	 * @return true if a new animal added successfully.
	 */
	public boolean addAnimal(Animal animal)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.save(animal);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in addAnimal.");
		}
		finally
		{
			session.close();
		}
		
		return success;
	}

	/**
	 * Update an existing animal from database.
	 * 
	 * @param animalApplianimalion object.
	 * @return true if the animal is updated successfully.
	 */
	public boolean updateAnimal(Animal animal)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.merge(animal);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in updateAnimal.");
		}
		finally
		{
			session.close();
		}
		
		return success;
	}

	/**
	 * Delete an existing animal from database.
	 * 
	 * @param animalApplianimalion object.
	 * @return true if the animal is deleted successfully.
	 */
	public boolean deleteAnimal(Animal animal)
	{
		Session session = null; 
		
		boolean success = false;
		
		try
		{
			session = db.getFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.delete(animal);
			session.getTransaction().commit();
			success = true;
		}
		catch(Exception e)
		{
			System.out.println("Error in deleteAnimal.");
		}
		finally
		{
			session.close();
		}
		
		return success;
	}
}

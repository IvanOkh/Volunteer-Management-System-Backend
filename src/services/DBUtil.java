package services;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import entities.Animal;
import entities.CARSID;
import entities.CatApplication;
import entities.DogApplication;
import entities.Event;
import entities.EventStaff;
import entities.Foster;
import entities.Volunteer;

/**
 * @author 794471
 *
 * Database connection service class
 */
@Service
public class DBUtil
{
	private static SessionFactory factory;
	
	public DBUtil()
	{
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Volunteer.class)
				.addAnnotatedClass(CARSID.class)
				.addAnnotatedClass(Foster.class)
				.addAnnotatedClass(DogApplication.class)
				.addAnnotatedClass(CatApplication.class)
				.addAnnotatedClass(Event.class)
				.addAnnotatedClass(EventStaff.class)
				.addAnnotatedClass(Animal.class)
				.buildSessionFactory();
		
		System.out.println("Factory created.");
	}
	
	public SessionFactory getFactory()
	{
		return factory;
	}
}

package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 794471
 *
 * object that represents an animal and is mapped to the animals table
 */
@Entity
@Table(name="animals")
public class Animal
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="animalid")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="date")
	private String date;
	
	@Column(name="age")
	private int age;
	
	@Column(name="species")
	private String species;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="bio")
	private String bio;
	
	@Column(name="medicalhistory")
	private String medicalHistory;
	
	@Column(name="status")
	private String status;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getSpecies()
	{
		return species;
	}

	public void setSpecies(String species)
	{
		this.species = species;
	}

	public String getBreed()
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public String getBio()
	{
		return bio;
	}

	public void setBio(String bio)
	{
		this.bio = bio;
	}

	public String getMedicalHistory()
	{
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory)
	{
		this.medicalHistory = medicalHistory;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
}

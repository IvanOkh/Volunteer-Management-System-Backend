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
 * object that represents the id and type of personnel associated with that id, mapped to the id table
 */
@Entity
@Table(name="id")
public class CARSID
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="type")
	private String type;

	public CARSID()
	{
		this.id = 0;
	}
	
	public int getId()
	{
		return id;
	}

	public String getType() 
	{
		return type;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setType(String type)
	{
		this.type = type;
	}
}

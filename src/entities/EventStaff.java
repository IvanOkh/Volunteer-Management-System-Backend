package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 794471
 *
 * object that represents the relationship between an event and a foster/volunteer
 */
@Entity
@Table(name = "eventstaff")
public class EventStaff implements Serializable
{
	private static final long serialVersionUID = -41211081083931205L;

	@Id
	@Column(name = "eventid")
	private int eventid;
	
	@Id
	@Column(name = "staffid")
	private int staffid;

	
	public int getEventid()
	{
		return eventid;
	}

	public void setEventid(int eventid)
	{
		this.eventid = eventid;
	}

	public int getStaffid()
	{
		return staffid;
	}

	public void setStaffid(int staffid)
	{
		this.staffid = staffid;
	}

	
	// auto-generated by Eclipse
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + eventid;
		result = prime * result + staffid;
		return result;
	}

	// auto-generated by Eclipse
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventStaff other = (EventStaff) obj;
		if (eventid != other.eventid)
			return false;
		if (staffid != other.staffid)
			return false;
		return true;
	}
}

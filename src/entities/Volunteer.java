package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 794471
 * 
 * object that represents a volunteer and contains the data from the form they submitted when they applied 
 */
@Entity
@Table(name="volunteers")
public class Volunteer
{
	@Column(name="approved")
	private boolean approved;
	
	@Column(name="active")
	private boolean active;
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="password")
	private String password;
	
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="streetaddress")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="province")
	private String province;
	
	@Column(name="postalcode")
	private String postalCode;
	
	@Column(name="cellphone")
	private String cellPhone;
	
	@Column(name="homephone")
	private String homePhone;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="dateofbirth")
	private String dateOfBirth;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="tshirtsize")
	private String tshirtSize;
	
	@Column(name="selfdescription")
	private String description;
	
	
	@Column(name="eme1fname")
	private String emg1_fname;
	
	@Column(name="eme1lname")
	private String emg1_lname;
	
	@Column(name="eme1relationship")
	private String emg1_relationship;
	
	@Column(name="eme1homephone")
	private String emg1_homePhone;
	
	@Column(name="eme1cellphone")
	private String emg1_cellPhone;
	
	@Column(name="eme1email")
	private String emg1_email;
	
	
	@Column(name="eme2fname")
	private String emg2_fname;
	
	@Column(name="eme2lname")
	private String emg2_lname;
	
	@Column(name="eme2relationship")
	private String emg2_relationship;
	
	@Column(name="eme2homephone")
	private String emg2_homePhone;
	
	@Column(name="eme2cellphone")
	private String emg2_cellPhone;
	
	@Column(name="eme2email")
	private String emg2_email;
	
	
	@Column(name="ref1fname")
	private String ref1_fname;
	
	@Column(name="ref1lname")
	private String ref1_lname;
	
	@Column(name="ref1cellphone")
	private String ref1_cellPhone;
	
	@Column(name="ref1email")
	private String ref1_email;
	
	
	@Column(name="ref2fname")
	private String ref2_fname;
	
	@Column(name="ref2lname")
	private String ref2_lname;
	
	@Column(name="ref2cellphone")
	private String ref2_cellPhone;
	
	@Column(name="ref2email")
	private String ref2_email;
	
	
	@Column(name="emailallowed")
	private boolean emailAllowed;
	
	@Column(name="emailpref")
	private String emailPref;

	public boolean isApproved()
	{
		return approved;
	}

	public void setApproved(boolean approved)
	{
		this.approved = approved;
	}

	public boolean isActive()
	{
		return active;
	}

	public void setActive(boolean active)
	{
		this.active = active;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}

	public String getCellPhone()
	{
		return cellPhone;
	}

	public void setCellPhone(String cellPhone)
	{
		this.cellPhone = cellPhone;
	}

	public String getHomePhone()
	{
		return homePhone;
	}

	public void setHomePhone(String homePhone)
	{
		this.homePhone = homePhone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getTshirtSize()
	{
		return tshirtSize;
	}

	public void setTshirtSize(String tshirtSize)
	{
		this.tshirtSize = tshirtSize;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getEmg1_fname()
	{
		return emg1_fname;
	}

	public void setEmg1_fname(String emg1_fname)
	{
		this.emg1_fname = emg1_fname;
	}

	public String getEmg1_lname()
	{
		return emg1_lname;
	}

	public void setEmg1_lname(String emg1_lname)
	{
		this.emg1_lname = emg1_lname;
	}

	public String getEmg1_relationship()
	{
		return emg1_relationship;
	}

	public void setEmg1_relationship(String emg1_relationship)
	{
		this.emg1_relationship = emg1_relationship;
	}

	public String getEmg1_homePhone()
	{
		return emg1_homePhone;
	}

	public void setEmg1_homePhone(String emg1_homePhone)
	{
		this.emg1_homePhone = emg1_homePhone;
	}

	public String getEmg1_cellPhone()
	{
		return emg1_cellPhone;
	}

	public void setEmg1_cellPhone(String emg1_cellPhone)
	{
		this.emg1_cellPhone = emg1_cellPhone;
	}

	public String getEmg1_email()
	{
		return emg1_email;
	}

	public void setEmg1_email(String emg1_email)
	{
		this.emg1_email = emg1_email;
	}

	public String getEmg2_fname()
	{
		return emg2_fname;
	}

	public void setEmg2_fname(String emg2_fname)
	{
		this.emg2_fname = emg2_fname;
	}

	public String getEmg2_lname()
	{
		return emg2_lname;
	}

	public void setEmg2_lname(String emg2_lname)
	{
		this.emg2_lname = emg2_lname;
	}

	public String getEmg2_relationship()
	{
		return emg2_relationship;
	}

	public void setEmg2_relationship(String emg2_relationship)
	{
		this.emg2_relationship = emg2_relationship;
	}

	public String getEmg2_homePhone()
	{
		return emg2_homePhone;
	}

	public void setEmg2_homePhone(String emg2_homePhone)
	{
		this.emg2_homePhone = emg2_homePhone;
	}

	public String getEmg2_cellPhone()
	{
		return emg2_cellPhone;
	}

	public void setEmg2_cellPhone(String emg2_cellPhone)
	{
		this.emg2_cellPhone = emg2_cellPhone;
	}

	public String getEmg2_email()
	{
		return emg2_email;
	}

	public void setEmg2_email(String emg2_email)
	{
		this.emg2_email = emg2_email;
	}

	public String getRef1_fname()
	{
		return ref1_fname;
	}

	public void setRef1_fname(String ref1_fname)
	{
		this.ref1_fname = ref1_fname;
	}

	public String getRef1_lname()
	{
		return ref1_lname;
	}

	public void setRef1_lname(String ref1_lname)
	{
		this.ref1_lname = ref1_lname;
	}

	public String getRef1_cellPhone()
	{
		return ref1_cellPhone;
	}

	public void setRef1_cellPhone(String ref1_cellPhone)
	{
		this.ref1_cellPhone = ref1_cellPhone;
	}

	public String getRef1_email()
	{
		return ref1_email;
	}

	public void setRef1_email(String ref1_email)
	{
		this.ref1_email = ref1_email;
	}

	public String getRef2_fname()
	{
		return ref2_fname;
	}

	public void setRef2_fname(String ref2_fname)
	{
		this.ref2_fname = ref2_fname;
	}

	public String getRef2_lname()
	{
		return ref2_lname;
	}

	public void setRef2_lname(String ref2_lname)
	{
		this.ref2_lname = ref2_lname;
	}

	public String getRef2_cellPhone()
	{
		return ref2_cellPhone;
	}

	public void setRef2_cellPhone(String ref2_cellPhone)
	{
		this.ref2_cellPhone = ref2_cellPhone;
	}

	public String getRef2_email()
	{
		return ref2_email;
	}

	public void setRef2_email(String ref2_email)
	{
		this.ref2_email = ref2_email;
	}

	public boolean isEmailAllowed()
	{
		return emailAllowed;
	}

	public void setEmailAllowed(boolean emailAllowed)
	{
		this.emailAllowed = emailAllowed;
	}

	public String getEmailPref()
	{
		return emailPref;
	}

	public void setEmailPref(String emailPref)
	{
		this.emailPref = emailPref;
	}
}

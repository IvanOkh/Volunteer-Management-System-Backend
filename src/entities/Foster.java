package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 794471
 * 
 * object that represents a foster and contains the data from the form they submitted when they applied 
 */
@Entity
@Table(name="fosters")
public class Foster
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
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="province")
	private String province;
	
	@Column(name="postalcode")
	private String postalCode;
	
	@Column(name="homephone")
	private String homePhone;
	
	@Column(name="cellphone")
	private String cellPhone;
	
	@Column(name="over18")
	private boolean over18;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="typeofresidence")
	private String typeOfResidence; // house OR duplex OR apartment OR mobile home OR farm/acreage OR [basement suite]
	
	@Column(name="own")
	private boolean own; // own/rent -> true/false
	
	@Column(name="landlordcontact")
	private String landlordContact; // name, phone number, OPTIONAL email
	
	@Column(name="childreninhome")
	private boolean childrenInHome; // yes/no -> true/false -> Angular
	
	@Column(name="household")
	private String household; 
	
	@Column(name="petallergies")
	private boolean allergies; // yes/no -> true/false
	
	@Column(name="safehandlingprocedures")
	private boolean householdHandling; // String -> boolean
	
	@Column(name="ownedpets")
	private boolean anyPets; // yes/no -> true/false
	
	@Column(name="ownedpetdetails")
	private String petDetails;
	
	@Column(name="spayedandneutered")
	private String spayedAndNeutered;
	
	@Column(name="doghabit")
	private String dogHabit; // indoor OR outdoor OR combo OR no dogs
	
	@Column(name="cathabit")
	private String catHabit; // indoor OR outdoor OR combo OR no cats
	
	@Column(name="familyagreeance")
	private boolean familyAgreeable; // yes/no -> true/false
	
	@Column(name="typeoffoster")
	private String fosterAnimalType; // true,true,true,true,true,true -> String
	
	@Column(name="typeofanimal")
	private String preferredAnimal;
	
	@Column(name="catfosterindoor")
	private boolean keepCatsIndoor; // yes/no -> true/false
	
	@Column(name="fencedyard")
	private boolean fencedYard; // yes/no -> true/false
	
	@Column(name="fenceheight")
	private double fenceHeight; // in inches
	
	@Column(name="willingtotrain")
	private boolean willingToTrain; // yes/no -> true/false
	
	@Column(name="cratetraining")
	private boolean familiarWithCrate; // yes/no -> true/false
	
	@Column(name="usingacrate")
	private boolean useDogCrate; // yes/no -> true/false
	
	@Column(name="rescueanimalexp")
	private String pastRescueExperience;
	
	@Column(name="willingtotaketovet")
	private boolean takeAnimalToVet; // yes/no -> true/false
	
	@Column(name="vehicletransport")
	private boolean haveVehicle; // yes/no -> true/false
	
	@Column(name="medicateanimal")
	private boolean medicateAnimal; // yes/no -> true/false
	
	@Column(name="hoursleftalone")
	private double hoursLeftAlone;
	
	
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
	
	
	@Column(name="ref3fname")
	private String ref3_fname;
	
	@Column(name="ref3lname")
	private String ref3_lname;
	
	@Column(name="ref3cellphone")
	private String ref3_cellPhone;
	
	@Column(name="ref3email")
	private String ref3_email;
	
	
	@Column(name="allowhomevisit")
	private boolean allowHomeVisit; // yes/no -> true/false


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


	public String getHomePhone()
	{
		return homePhone;
	}


	public void setHomePhone(String homePhone)
	{
		this.homePhone = homePhone;
	}


	public String getCellPhone()
	{
		return cellPhone;
	}


	public void setCellPhone(String cellPhone)
	{
		this.cellPhone = cellPhone;
	}


	public boolean isOver18()
	{
		return over18;
	}


	public void setOver18(boolean over18)
	{
		this.over18 = over18;
	}


	public String getEmail()
	{
		return email;
	}


	public void setEmail(String email)
	{
		this.email = email;
	}


	public String getTypeOfResidence()
	{
		return typeOfResidence;
	}


	public void setTypeOfResidence(String typeOfResidence)
	{
		this.typeOfResidence = typeOfResidence;
	}


	public boolean isOwn()
	{
		return own;
	}


	public void setOwn(boolean own)
	{
		this.own = own;
	}


	public String getLandlordContact()
	{
		return landlordContact;
	}


	public void setLandlordContact(String landlordContact)
	{
		this.landlordContact = landlordContact;
	}


	public boolean isChildrenInHome()
	{
		return childrenInHome;
	}


	public void setChildrenInHome(boolean childrenInHome)
	{
		this.childrenInHome = childrenInHome;
	}


	public String getHousehold()
	{
		return household;
	}


	public void setHousehold(String household)
	{
		this.household = household;
	}


	public boolean isAllergies()
	{
		return allergies;
	}


	public void setAllergies(boolean allergies)
	{
		this.allergies = allergies;
	}


	public boolean isHouseholdHandling()
	{
		return householdHandling;
	}


	public void setHouseholdHandling(boolean householdHandling)
	{
		this.householdHandling = householdHandling;
	}


	public boolean isAnyPets()
	{
		return anyPets;
	}


	public void setAnyPets(boolean anyPets)
	{
		this.anyPets = anyPets;
	}


	public String getPetDetails()
	{
		return petDetails;
	}


	public void setPetDetails(String petDetails)
	{
		this.petDetails = petDetails;
	}


	public String getSpayedAndNeutered()
	{
		return spayedAndNeutered;
	}


	public void setSpayedAndNeutered(String spayedAndNeutered)
	{
		this.spayedAndNeutered = spayedAndNeutered;
	}


	public String getDogHabit()
	{
		return dogHabit;
	}


	public void setDogHabit(String dogHabit)
	{
		this.dogHabit = dogHabit;
	}


	public String getCatHabit()
	{
		return catHabit;
	}


	public void setCatHabit(String catHabit)
	{
		this.catHabit = catHabit;
	}


	public boolean isFamilyAgreeable()
	{
		return familyAgreeable;
	}


	public void setFamilyAgreeable(boolean familyAgreeable)
	{
		this.familyAgreeable = familyAgreeable;
	}


	public String getFosterAnimalType()
	{
		return fosterAnimalType;
	}


	public void setFosterAnimalType(String fosterAnimalType)
	{
		this.fosterAnimalType = fosterAnimalType;
	}


	public String getPreferredAnimal()
	{
		return preferredAnimal;
	}


	public void setPreferredAnimal(String preferredAnimal)
	{
		this.preferredAnimal = preferredAnimal;
	}


	public boolean isKeepCatsIndoor()
	{
		return keepCatsIndoor;
	}


	public void setKeepCatsIndoor(boolean keepCatsIndoor)
	{
		this.keepCatsIndoor = keepCatsIndoor;
	}


	public boolean isFencedYard()
	{
		return fencedYard;
	}


	public void setFencedYard(boolean fencedYard)
	{
		this.fencedYard = fencedYard;
	}


	public double getFenceHeight()
	{
		return fenceHeight;
	}


	public void setFenceHeight(double fenceHeight)
	{	
		this.fenceHeight = fenceHeight;
	}


	public boolean isWillingToTrain()
	{
		return willingToTrain;
	}


	public void setWillingToTrain(boolean willingToTrain)
	{
		this.willingToTrain = willingToTrain;
	}


	public boolean isFamiliarWithCrate()
	{
		return familiarWithCrate;
	}


	public void setFamiliarWithCrate(boolean familiarWithCrate)
	{
		this.familiarWithCrate = familiarWithCrate;
	}


	public boolean isUseDogCrate()
	{
		return useDogCrate;
	}


	public void setUseDogCrate(boolean useDogCrate)
	{
		this.useDogCrate = useDogCrate;
	}


	public String getPastRescueExperience()
	{
		return pastRescueExperience;
	}


	public void setPastRescueExperience(String pastRescueExperience)
	{
		this.pastRescueExperience = pastRescueExperience;
	}


	public boolean isTakeAnimalToVet()
	{
		return takeAnimalToVet;
	}


	public void setTakeAnimalToVet(boolean takeAnimalToVet)
	{
		this.takeAnimalToVet = takeAnimalToVet;
	}


	public boolean isHaveVehicle()
	{
		return haveVehicle;
	}


	public void setHaveVehicle(boolean haveVehicle)
	{
		this.haveVehicle = haveVehicle;
	}


	public boolean isMedicateAnimal()
	{
		return medicateAnimal;
	}


	public void setMedicateAnimal(boolean medicateAnimal)
	{
		this.medicateAnimal = medicateAnimal;
	}


	public double getHoursLeftAlone()
	{
		return hoursLeftAlone;
	}


	public void setHoursLeftAlone(double hoursLeftAlone)
	{
		this.hoursLeftAlone = hoursLeftAlone;
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


	public String getRef3_fname()
	{
		return ref3_fname;
	}


	public void setRef3_fname(String ref3_fname)
	{
		this.ref3_fname = ref3_fname;
	}


	public String getRef3_lname()
	{
		return ref3_lname;
	}


	public void setRef3_lname(String ref3_lname)
	{
		this.ref3_lname = ref3_lname;
	}


	public String getRef3_cellPhone()
	{
		return ref3_cellPhone;
	}


	public void setRef3_cellPhone(String ref3_cellPhone)
	{
		this.ref3_cellPhone = ref3_cellPhone;
	}


	public String getRef3_email()
	{
		return ref3_email;
	}


	public void setRef3_email(String ref3_email)
	{
		this.ref3_email = ref3_email;
	}


	public boolean isAllowHomeVisit()
	{
		return allowHomeVisit;
	}


	public void setAllowHomeVisit(boolean allowHomeVisit)
	{
		this.allowHomeVisit = allowHomeVisit;
	}
}

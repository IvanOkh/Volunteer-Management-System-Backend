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
 * object that contains all the information for a single dog adoption application form
 * mapped to the dogapplication table
 */
@Entity
@Table(name="dogapplication")
public class DogApplication 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nameofdog")
	private String nameOfDog;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="province")
	private String province;// 2 letter abbreviation 
	
	@Column(name="postalcode")
	private String postalCode; // A1A-1A1
	 
	@Column(name="homephone")
	private String homePhone;
	
	@Column(name="cellphone")
	private String cellPhone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="age")
	private int age;
	
	
	//YOUR FAMILY AND LIFESTYLE
	@Column(name="householdagreement")
	private boolean householdAgreement; // yes/no 
	
	@Column(name="membersintroduced")
	private boolean membersIntroduced; // yes/no
	
	@Column(name="dogallergies")
	private boolean dogAllergies; // yes/no
	
	@Column(name="howmanyadults")
	private int howManyAdults; // number of adults
	
	@Column(name="howmanychild")
	private int howManyChildren; // number of children
	
	@Column(name="childrenages")
	private String childrenAges; // {#},{#},{#},{#}...
	
	@Column(name="childrenhandling")
	private String childrenDogHandling;
	
	@Column(name="childrenvisit")
	private boolean childrenVisiting; // yes/no
	
	@Column(name="visitingfrequency")
	private String visitingFrequency; // daily OR weekly OR monthly OR annually
	
	@Column(name="childrenprepared")
	private String childrenPrepared; 
	
	@Column(name="familybusy")
	private String familyBusy; // very busy OR a little OR not at all	
	
	@Column(name="activefamily")
	private String familyActive; // very busy OR a little OR not at all
	
	@Column(name="scheduleregularity")
	private String scheduleRegularity; // very regular OR very irregular OR moderate	
	
	@Column(name="familypersonality")
	private String familyPersonality;		
	
	@Column(name="plans")
	private String familyPlans; // moving OR vacation OR change (change in schedule) OR {other}
	
	
	//YOUR HOME	
	@Column(name="typeofresidence")
	private String typeOfResidence;	// house OR apartment OR condo OR trailer OR inner city OR suburban OR acreage OR rural OR {other}
	
	@Column(name="own")
	private boolean own; // own/rent -> true/false	
	
	@Column(name="landlordcontact")
	private String landlordContact;	
	
	@Column(name="dogsallowed")
	private boolean dogsAllowed; // yes/no -> true/false
	
	@Column(name="restrictions")
	private String restrictions; // true,true,true -> String
	
	@Column(name="livingsituationchanges")
	private String livingSituationChanges;
	
	@Column(name="outdoorareas")
	private String yardType; // no yard OR fenced OR not fenced OR partially fenced
	
	@Column(name="fencetype")
	private String fenceType;
	
	@Column(name="fenceheight")
	private double fenceHeight;
	
	@Column(name="dogaddons")
	private String dogAddons; //true,true,true,true
	
	
	//Current/Previous pets
	@Column(name="anydogs")
	private boolean otherDogs; // yes/no -> true/false
	
	@Column(name="dogsinfo")
	private String dogsInfo;
	
	@Column(name="otherpets")
	private boolean otherPets; // yes/no -> true/false
	
	@Column(name="otherpetsinfo")
	private String otherPetsInfo;
	
	@Column(name="spayedandneutered")
	private int spayedAndNeutered;
	
	@Column(name="animallocation")
	private String petLocation;
	
	@Column(name="prioradoption")
	private boolean priorAdoption; // yes/no -> true/false
	
	@Column(name="groupname")
	private String groupName;
	
	@Column(name="surrenderedanimal")
	private boolean surrenderedPet; // yes/no -> true/false
	
	@Column(name="circumstances")
	private String circumstances;
	
	@Column(name="vetinfo")
	private String vetInfo;
	
	
	//New Pet Info
	@Column(name="dogprimarycaretaker")
	private String primaryCaretaker;
	
	@Column(name="dogsprior")
	private boolean hadDogs; // yes/no -> true/false
	
	@Column(name="housebroken")
	private boolean housebrokenBefore; // yes/no -> true/false
	
	@Column(name="dogcorrection")
	private String dogCorrectionPlan;
	
	@Column(name="dogstayday")
	private String dogStayDay; // true,true,true,true,true,true,true,true
	
	@Column(name="dogstaynight")
	private String dogStayNight; // true,true,true,true,true,true,true,true
	
	@Column(name="dogstayvacation")
	private String vacationHome; // at home with care OR boarding OR with family/friends OR {other}
	
	@Column(name="leftaloneweek")
	private double leftAloneWeekday;
	
	@Column(name="leftaloneweekend")
	private double leftAloneWeekend;
	
	@Column(name="petadjustment")
	private double petAdjustment;
	
	@Column(name="dogactivties")
	private String dogActivities; // true,true,true.... x16 total
	
	@Column(name="foodexpenses")
	private double foodExpenses;
	
	@Column(name="vetexpenses")
	private double vetExpenses;
	
	@Column(name="groomingexpenses")
	private double groomingExpenses;
	
	@Column(name="boardingexpenses")
	private double boardingExpenses;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dogcoat")
	private String typeOfCoat;
	
	@Column(name="dogage")
	private String dogAge;
	
	@Column(name="breedtypecolour")
	private String breedTypeColour;
	
	@Column(name="friendlywithchild")
	private String friendlyWithChildren; // V or S or N
	
	@Column(name="friendlywithdogs")
	private String friendlyWithDogs; // V or S or N
	
	@Column(name="friendlywithcats")
	private String friendlyWithCats; // V or S or N
	
	@Column(name="friendlywithme")
	private String friendlyWithMe; // V or S or N
	
	@Column(name="friendlywithvisitors")
	private String friendlyWithVisitors; // V or S or N
	
	@Column(name="enjoybeinggroomed")
	private String enjoyBeingGroomed; // V or S or N
	
	@Column(name="enjoybeingheld")
	private String enjoyBeingHeld; // V or S or N
	
	@Column(name="enjoybeingpetted")
	private String enjoyBeingPetted; // V or S or N
	
	@Column(name="becalm")
	private String beCalm; // V or S or N
	
	@Column(name="beactive")
	private String beActive; // V or S or N
	
	@Column(name="beplayful")
	private String bePlayful; // V or S or N
	
	@Column(name="bequiet")
	private String beQuiet; // V or S or N
	
	@Column(name="beindependant")
	private String beIndependent; // V or S or N
	
	@Column(name="wakeupatnight")
	private String wakeMeUpAtNight; // V or S or N
	
	@Column(name="aggressivebehaviour")
	private String aggressiveBehaviour; // V or S or N
	
	@Column(name="beprotective")
	private String beProtective; // V or S or N
	
	@Column(name="housetrained")
	private String houseTrained;
	
	@Column(name="obediencetrained")
	private String obedienceTrained;
	
	@Column(name="firsttimeowner")
	private String firstTimeOwner;
	
	@Column(name="obedienceknowledge")
	private String obedienceKnowledge;
	
	@Column(name="difficultdog")
	private String handleDifficultDog;
	
	@Column(name="trainingclasses")
	private String trainingClasses;	
	
	@Column(name="dogexpectations")
	private String lifeStyleChange;
	
	@Column(name="dogmedical")
	private boolean medical;
	
	@Column(name="dogpast")
	private String dogPast;	
	
	@Column(name="doginsurance")
	private boolean insurance;
	
	@Column(name="dogmaturing")
	private boolean dogMaturing;
	
	@Column(name="giveupdog")
	private String giveUpDog;
	
	@Column(name="dogcircumstances")
	private String giveUpCirucumstances;

	
	@Column(name="ref1fname")
	private String ref1_fname;
	
	@Column(name="ref1lname")
	private String ref1_lname;
	
	@Column(name="ref1relationship")
	private String ref1_relationship;
	
	@Column(name="ref1phonenumber")
	private String ref1_phoneNumber;
	
	@Column(name="ref1email")
	private String ref1_email;
	
	
	@Column(name="ref2fname")
	private String ref2_fname;
	
	@Column(name="ref2lname")
	private String ref2_lname;
	
	@Column(name="ref2relationship")
	private String ref2_relationship;
	
	@Column(name="ref2phonenumber")
	private String ref2_phoneNumber;
	
	@Column(name="ref2email")
	private String ref2_email;
	
	
	@Column(name="findoutanimal")
	private String findOutAbout;


	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getNameOfDog()
	{
		return nameOfDog;
	}


	public void setNameOfDog(String nameOfDog)
	{
		this.nameOfDog = nameOfDog;
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


	public String getEmail()
	{
		return email;
	}


	public void setEmail(String email)
	{
		this.email = email;
	}


	public int getAge()
	{
		return age;
	}


	public void setAge(int age)
	{
		this.age = age;
	}


	public boolean isHouseholdAgreement()
	{
		return householdAgreement;
	}


	public void setHouseholdAgreement(boolean householdAgreement)
	{
		this.householdAgreement = householdAgreement;
	}


	public boolean isMembersIntroduced()
	{
		return membersIntroduced;
	}


	public void setMembersIntroduced(boolean membersIntroduced)
	{
		this.membersIntroduced = membersIntroduced;
	}


	public boolean isDogAllergies()
	{
		return dogAllergies;
	}


	public void setDogAllergies(boolean dogAllergies)
	{
		this.dogAllergies = dogAllergies;
	}


	public int getHowManyAdults()
	{
		return howManyAdults;
	}


	public void setHowManyAdults(int howManyAdults)
	{
		this.howManyAdults = howManyAdults;
	}


	public int getHowManyChildren()
	{
		return howManyChildren;
	}


	public void setHowManyChildren(int howManyChildren)
	{
		this.howManyChildren = howManyChildren;
	}


	public String getChildrenAges()
	{
		return childrenAges;
	}


	public void setChildrenAges(String childrenAges)
	{
		this.childrenAges = childrenAges;
	}


	public String getChildrenDogHandling()
	{
		return childrenDogHandling;
	}


	public void setChildrenDogHandling(String childrenDogHandling)
	{
		this.childrenDogHandling = childrenDogHandling;
	}


	public boolean isChildrenVisiting()
	{
		return childrenVisiting;
	}


	public void setChildrenVisiting(boolean childrenVisiting)
	{
		this.childrenVisiting = childrenVisiting;
	}


	public String getVisitingFrequency()
	{
		return visitingFrequency;
	}


	public void setVisitingFrequency(String visitingFrequency)
	{
		this.visitingFrequency = visitingFrequency;
	}


	public String getChildrenPrepared()
	{
		return childrenPrepared;
	}


	public void setChildrenPrepared(String childrenPrepared)
	{
		this.childrenPrepared = childrenPrepared;
	}


	public String getFamilyBusy()
	{
		return familyBusy;
	}


	public void setFamilyBusy(String familyBusy)
	{
		this.familyBusy = familyBusy;
	}


	public String getFamilyActive()
	{
		return familyActive;
	}


	public void setFamilyActive(String familyActive)
	{
		this.familyActive = familyActive;
	}


	public String getScheduleRegularity()
	{
		return scheduleRegularity;
	}


	public void setScheduleRegularity(String scheduleRegularity)
	{
		this.scheduleRegularity = scheduleRegularity;
	}


	public String getFamilyPersonality()
	{
		return familyPersonality;
	}


	public void setFamilyPersonality(String familyPersonality)
	{
		this.familyPersonality = familyPersonality;
	}


	public String getFamilyPlans()
	{
		return familyPlans;
	}


	public void setFamilyPlans(String familyPlans)
	{
		this.familyPlans = familyPlans;
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


	public boolean isDogsAllowed()
	{
		return dogsAllowed;
	}


	public void setDogsAllowed(boolean dogsAllowed)
	{
		this.dogsAllowed = dogsAllowed;
	}


	public String getRestrictions()
	{
		return restrictions;
	}


	public void setRestrictions(String restrictions)
	{
		this.restrictions = restrictions;
	}


	public String getLivingSituationChanges()
	{
		return livingSituationChanges;
	}


	public void setLivingSituationChanges(String livingSituationChanges)
	{
		this.livingSituationChanges = livingSituationChanges;
	}


	public String getYardType()
	{
		return yardType;
	}


	public void setYardType(String yardType)
	{
		this.yardType = yardType;
	}


	public String getFenceType()
	{
		return fenceType;
	}


	public void setFenceType(String fenceType)
	{
		this.fenceType = fenceType;
	}


	public double getFenceHeight()
	{
		return fenceHeight;
	}


	public void setFenceHeight(double fenceHeight)
	{
		this.fenceHeight = fenceHeight;
	}


	public String getDogAddons()
	{
		return dogAddons;
	}


	public void setDogAddons(String dogAddons)
	{
		this.dogAddons = dogAddons;
	}


	public boolean isOtherDogs()
	{
		return otherDogs;
	}


	public void setOtherDogs(boolean otherDogs)
	{
		this.otherDogs = otherDogs;
	}


	public String getDogsInfo()
	{
		return dogsInfo;
	}


	public void setDogsInfo(String dogsInfo)
	{
		this.dogsInfo = dogsInfo;
	}


	public boolean isOtherPets()
	{
		return otherPets;
	}


	public void setOtherPets(boolean otherPets)
	{
		this.otherPets = otherPets;
	}


	public String getOtherPetsInfo()
	{
		return otherPetsInfo;
	}


	public void setOtherPetsInfo(String otherPetsInfo)
	{
		this.otherPetsInfo = otherPetsInfo;
	}


	public int getSpayedAndNeutered()
	{
		return spayedAndNeutered;
	}


	public void setSpayedAndNeutered(int spayedAndNeutered)
	{
		this.spayedAndNeutered = spayedAndNeutered;
	}


	public String getPetLocation()
	{
		return petLocation;
	}


	public void setPetLocation(String petLocation)
	{
		this.petLocation = petLocation;
	}


	public boolean isPriorAdoption()
	{
		return priorAdoption;
	}


	public void setPriorAdoption(boolean priorAdoption)
	{
		this.priorAdoption = priorAdoption;
	}


	public String getGroupName()
	{
		return groupName;
	}


	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}


	public boolean isSurrenderedPet()
	{
		return surrenderedPet;
	}


	public void setSurrenderedPet(boolean surrenderedPet)
	{
		this.surrenderedPet = surrenderedPet;
	}


	public String getCircumstances()
	{
		return circumstances;
	}


	public void setCircumstances(String circumstances)
	{
		this.circumstances = circumstances;
	}


	public String getVetInfo()
	{
		return vetInfo;
	}


	public void setVetInfo(String vetInfo)
	{
		this.vetInfo = vetInfo;
	}


	public String getPrimaryCaretaker()
	{
		return primaryCaretaker;
	}


	public void setPrimaryCaretaker(String primaryCaretaker)
	{
		this.primaryCaretaker = primaryCaretaker;
	}


	public boolean isHadDogs()
	{
		return hadDogs;
	}


	public void setHadDogs(boolean hadDogs)
	{
		this.hadDogs = hadDogs;
	}


	public boolean isHousebrokenBefore()
	{
		return housebrokenBefore;
	}


	public void setHousebrokenBefore(boolean housebrokenBefore)
	{
		this.housebrokenBefore = housebrokenBefore;
	}


	public String getDogCorrectionPlan()
	{
		return dogCorrectionPlan;
	}


	public void setDogCorrectionPlan(String dogCorrectionPlan)
	{
		this.dogCorrectionPlan = dogCorrectionPlan;
	}


	public String getDogStayDay()
	{
		return dogStayDay;
	}


	public void setDogStayDay(String dogStayDay)
	{
		this.dogStayDay = dogStayDay;
	}


	public String getDogStayNight()
	{
		return dogStayNight;
	}


	public void setDogStayNight(String dogStayNight)
	{
		this.dogStayNight = dogStayNight;
	}


	public String getVacationHome()
	{
		return vacationHome;
	}


	public void setVacationHome(String vacationHome)
	{
		this.vacationHome = vacationHome;
	}


	public double getLeftAloneWeekday()
	{
		return leftAloneWeekday;
	}


	public void setLeftAloneWeekday(double leftAloneWeekday)
	{
		this.leftAloneWeekday = leftAloneWeekday;
	}


	public double getLeftAloneWeekend()
	{
		return leftAloneWeekend;
	}


	public void setLeftAloneWeekend(double leftAloneWeekend)
	{
		this.leftAloneWeekend = leftAloneWeekend;
	}


	public double getPetAdjustment()
	{
		return petAdjustment;
	}


	public void setPetAdjustment(double petAdjustment)
	{
		this.petAdjustment = petAdjustment;
	}


	public String getDogActivities()
	{
		return dogActivities;
	}


	public void setDogActivities(String dogActivities)
	{
		this.dogActivities = dogActivities;
	}


	public double getFoodExpenses()
	{
		return foodExpenses;
	}


	public void setFoodExpenses(double foodExpenses)
	{
		this.foodExpenses = foodExpenses;
	}


	public double getVetExpenses()
	{
		return vetExpenses;
	}


	public void setVetExpenses(double vetExpenses)
	{
		this.vetExpenses = vetExpenses;
	}


	public double getGroomingExpenses()
	{
		return groomingExpenses;
	}


	public void setGroomingExpenses(double groomingExpenses)
	{
		this.groomingExpenses = groomingExpenses;
	}


	public double getBoardingExpenses()
	{
		return boardingExpenses;
	}


	public void setBoardingExpenses(double boardingExpenses)
	{
		this.boardingExpenses = boardingExpenses;
	}


	public String getGender()
	{
		return gender;
	}


	public void setGender(String gender)
	{
		this.gender = gender;
	}


	public String getTypeOfCoat()
	{
		return typeOfCoat;
	}


	public void setTypeOfCoat(String typeOfCoat)
	{
		this.typeOfCoat = typeOfCoat;
	}


	public String getDogAge()
	{
		return dogAge;
	}


	public void setDogAge(String dogAge)
	{
		this.dogAge = dogAge;
	}


	public String getBreedTypeColour()
	{
		return breedTypeColour;
	}


	public void setBreedTypeColour(String breedTypeColour)
	{
		this.breedTypeColour = breedTypeColour;
	}


	public String getFriendlyWithChildren()
	{
		return friendlyWithChildren;
	}


	public void setFriendlyWithChildren(String friendlyWithChildren)
	{
		this.friendlyWithChildren = friendlyWithChildren;
	}


	public String getFriendlyWithDogs()
	{
		return friendlyWithDogs;
	}


	public void setFriendlyWithDogs(String friendlyWithDogs)
	{
		this.friendlyWithDogs = friendlyWithDogs;
	}


	public String getFriendlyWithCats()
	{
		return friendlyWithCats;
	}


	public void setFriendlyWithCats(String friendlyWithCats)
	{
		this.friendlyWithCats = friendlyWithCats;
	}


	public String getFriendlyWithMe()
	{
		return friendlyWithMe;
	}


	public void setFriendlyWithMe(String friendlyWithMe)
	{
		this.friendlyWithMe = friendlyWithMe;
	}


	public String getFriendlyWithVisitors()
	{
		return friendlyWithVisitors;
	}


	public void setFriendlyWithVisitors(String friendlyWithVisitors)
	{
		this.friendlyWithVisitors = friendlyWithVisitors;
	}


	public String getEnjoyBeingGroomed()
	{
		return enjoyBeingGroomed;
	}


	public void setEnjoyBeingGroomed(String enjoyBeingGroomed)
	{
		this.enjoyBeingGroomed = enjoyBeingGroomed;
	}


	public String getEnjoyBeingHeld()
	{
		return enjoyBeingHeld;
	}


	public void setEnjoyBeingHeld(String enjoyBeingHeld)
	{
		this.enjoyBeingHeld = enjoyBeingHeld;
	}


	public String getEnjoyBeingPetted()
	{
		return enjoyBeingPetted;
	}


	public void setEnjoyBeingPetted(String enjoyBeingPetted)
	{
		this.enjoyBeingPetted = enjoyBeingPetted;
	}


	public String getBeCalm()
	{
		return beCalm;
	}


	public void setBeCalm(String beCalm)
	{
		this.beCalm = beCalm;
	}


	public String getBeActive()
	{
		return beActive;
	}


	public void setBeActive(String beActive)
	{
		this.beActive = beActive;
	}


	public String getBePlayful()
	{
		return bePlayful;
	}


	public void setBePlayful(String bePlayful)
	{
		this.bePlayful = bePlayful;
	}


	public String getBeQuiet()
	{
		return beQuiet;
	}


	public void setBeQuiet(String beQuiet)
	{
		this.beQuiet = beQuiet;
	}


	public String getBeIndependent()
	{
		return beIndependent;
	}


	public void setBeIndependent(String beIndependent)
	{
		this.beIndependent = beIndependent;
	}


	public String getWakeMeUpAtNight()
	{
		return wakeMeUpAtNight;
	}


	public void setWakeMeUpAtNight(String wakeMeUpAtNight)
	{
		this.wakeMeUpAtNight = wakeMeUpAtNight;
	}


	public String getAggressiveBehaviour()
	{
		return aggressiveBehaviour;
	}


	public void setAggressiveBehaviour(String aggressiveBehaviour)
	{
		this.aggressiveBehaviour = aggressiveBehaviour;
	}


	public String getBeProtective()
	{
		return beProtective;
	}


	public void setBeProtective(String beProtective)
	{
		this.beProtective = beProtective;
	}


	public String getHouseTrained()
	{
		return houseTrained;
	}


	public void setHouseTrained(String houseTrained)
	{
		this.houseTrained = houseTrained;
	}


	public String getObedienceTrained()
	{
		return obedienceTrained;
	}


	public void setObedienceTrained(String obedienceTrained)
	{
		this.obedienceTrained = obedienceTrained;
	}


	public String getFirstTimeOwner()
	{
		return firstTimeOwner;
	}


	public void setFirstTimeOwner(String firstTimeOwner)
	{
		this.firstTimeOwner = firstTimeOwner;
	}


	public String getObedienceKnowledge()
	{
		return obedienceKnowledge;
	}


	public void setObedienceKnowledge(String obedienceKnowledge)
	{
		this.obedienceKnowledge = obedienceKnowledge;
	}


	public String getHandleDifficultDog()
	{
		return handleDifficultDog;
	}


	public void setHandleDifficultDog(String handleDifficultDog)
	{
		this.handleDifficultDog = handleDifficultDog;
	}


	public String getTrainingClasses()
	{
		return trainingClasses;
	}


	public void setTrainingClasses(String trainingClasses)
	{
		this.trainingClasses = trainingClasses;
	}


	public String getLifeStyleChange()
	{
		return lifeStyleChange;
	}


	public void setLifeStyleChange(String lifeStyleChange)
	{
		this.lifeStyleChange = lifeStyleChange;
	}


	public boolean isMedical()
	{
		return medical;
	}


	public void setMedical(boolean medical)
	{
		this.medical = medical;
	}


	public String getDogPast()
	{
		return dogPast;
	}


	public void setDogPast(String dogPast)
	{
		this.dogPast = dogPast;
	}


	public boolean isInsurance()
	{
		return insurance;
	}


	public void setInsurance(boolean insurance)
	{
		this.insurance = insurance;
	}


	public boolean isDogMaturing()
	{
		return dogMaturing;
	}


	public void setDogMaturing(boolean dogMaturing)
	{
		this.dogMaturing = dogMaturing;
	}


	public String getGiveUpDog()
	{
		return giveUpDog;
	}


	public void setGiveUpDog(String giveUpDog)
	{
		this.giveUpDog = giveUpDog;
	}


	public String getGiveUpCirucumstances()
	{
		return giveUpCirucumstances;
	}


	public void setGiveUpCirucumstances(String giveUpCirucumstances)
	{
		this.giveUpCirucumstances = giveUpCirucumstances;
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


	public String getRef1_relationship()
	{
		return ref1_relationship;
	}


	public void setRef1_relationship(String ref1_relationship)
	{
		this.ref1_relationship = ref1_relationship;
	}


	public String getRef1_phoneNumber()
	{
		return ref1_phoneNumber;
	}


	public void setRef1_phoneNumber(String ref1_phoneNumber)
	{
		this.ref1_phoneNumber = ref1_phoneNumber;
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


	public String getRef2_relationship()
	{
		return ref2_relationship;
	}


	public void setRef2_relationship(String ref2_relationship)
	{
		this.ref2_relationship = ref2_relationship;
	}


	public String getRef2_phoneNumber()
	{
		return ref2_phoneNumber;
	}


	public void setRef2_phoneNumber(String ref2_phoneNumber)
	{
		this.ref2_phoneNumber = ref2_phoneNumber;
	}


	public String getRef2_email()
	{
		return ref2_email;
	}


	public void setRef2_email(String ref2_email)
	{
		this.ref2_email = ref2_email;
	}


	public String getFindOutAbout()
	{
		return findOutAbout;
	}


	public void setFindOutAbout(String findOutAbout)
	{
		this.findOutAbout = findOutAbout;
	}
	
	
}

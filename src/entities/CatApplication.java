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
 * object that contains all the information for a single cat adoption application form
 * mapped to the catapplication table
 */
@Entity
@Table(name="catapplication")
public class CatApplication 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	// can be null if they don't have a particular cat in mind
	@Column(name="nameofcat")
	private String nameOfCat; 
	
	// adopters first and last name
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	// adopters address
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="province")
	private String province; // 2 letter abbreviation
	
	@Column(name="postalcode")
	private String postalCode; // A1A-1A1
	
	// adopters contact info
	@Column(name="homephone")
	private String homePhone; // 403-555-5555
	
	@Column(name="cellphone")
	private String cellPhone; // 403-555-5555
	
	@Column(name="email")
	private String email; // abc@abc.abc
	
	// adopters age
	@Column(name="age")
	private int age;
	
	
	@Column(name="personcatisfor")
	private String personCatIsFor; // self or {other}
	
	@Column(name="householdagreement")
	private boolean householdAgreement; // yes/no -> true/false
	
	@Column(name="membersintroduced")
	private boolean membersIntroduced; // yes/no -> true/false
	
	@Column(name="catallergies")
	private boolean catAllergies; // yes/no -> true/false
	
	@Column(name="howmanyadults")
	private int howManyAdults; // number of adults
	
	@Column(name="howmanychild")
	private int howManyChildren; // number of children
	
	@Column(name="childrenages")
	private String childrenAges; // {#},{#},{#},{#}...
	
	@Column(name="childrenhandling")
	private String childrenCatHandling; // explain if children have been taught to handle cats
	
	@Column(name="childrenvisit")
	private boolean childrenVisiting; // yes/no -> true/false
	
	@Column(name="visitingfrequency")
	private String visitingFrequency; // daily OR weekly OR monthly OR annually
	
	@Column(name="childrenprepared")
	private String childrenPrepared; // explain if children have been taught to respect cats boundaries
	
	@Column(name="familybusy")
	private String familyBusy; // very busy OR a little OR not at all
	
	@Column(name="activefamily")
	private String familyActive; // very busy OR a little OR not at all
	
	@Column(name="scheduleregularity")
	private String scheduleRegularity; // very regular OR very irregular OR moderate
	
	@Column(name="familypersonality")
	private String familyPersonality ; // describe your families personality
	
	@Column(name="plans")
	private String familyPlans; // moving OR vacation OR change (change in schedule) OR {other}
	
	
	@Column(name="typeofresidence")
	private String typeOfResidence; // house OR apartment OR condo OR trailer OR inner city OR suburban OR acreage OR rural OR {other}
	
	@Column(name="own")
	private boolean own; // own/rent -> true/false
	
	@Column(name="landlordcontact")
	private String landlordContact; // name, phone number, OPTIONAL email
	
	@Column(name="catsallowed")
	private boolean catsAllowed; // yes/no -> true/false
	
	@Column(name="restrictions")
	private String restrictions; // true,true,true -> String
	
	@Column(name="outdoorareas")
	private String outdoorAreas; // balcony OR patio OR yard OR cat condo OR none OR {other}
	
	@Column(name="busystreet")
	private String typeOfStreet; // busy OR quiet OR main road OR {other}
	
	@Column(name="cathome")
	private String catHome; // true,true,true,true,true,true,true,true,true -> String
	
	@Column(name="livingsituationchanges")
	private String livingSituationChanges; // explain what will happen to the cat if living situation changes
	
	
	@Column(name="anycats")
	private boolean otherCats; 
	
	@Column(name="catsinfo")
	private String catsInfo; // info about other owned cats
	
	@Column(name="catattitude")
	private String catsAttitude; // true,true,true,true,true -> String
	
	@Column(name="otherpets")
	private boolean otherPets; // yes/no -> true/false
	
	@Column(name="otherpetsinfo")
	private String otherPetsInfo; // {pet type},{pet type},{pet type},{pet type}....
	
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
	private String vetInfo; // name, phone number
	
	
	@Column(name="expectations")
	private String expectations;
	
	@Column(name="mainpurpose")
	private String purpose; // companion OR muuser OR companion for pet OR barn cat OR gift OR {other}
	
	@Column(name="primarycaretaker")
	private String primaryCaretaker;
	
	@Column(name="catsprior")
	private boolean hadCats; // yes/no -> true/false
	
	@Column(name="vacationhome")
	private String vacationHome; // at home with care OR boarding OR with family/friends OR {other}
	
	@Column(name="leftaloneweekday")
	private int leftAloneWeekday;
	
	@Column(name="leftaloneweekend")
	private int leftAloneWeekend;
	
	@Column(name="dailyexercise")
	private int dailyExercise;
	
	@Column(name="petadjustment")
	private int petAdjustment;
	
	@Column(name="foodexpenses")
	private double foodExpenses;
	
	@Column(name="vetexpenses")
	private double vetExpenses;
	
	@Column(name="groomingexpenses")
	private double groomingExpenses;
	
	@Column(name="boardingexpenses")
	private double boardingExpenses;
	
	@Column(name="gender")
	private String gender; // male OR female OR either
	
	@Column(name="catcoat")
	private String typeOfCoat; // short OR medium OR long OR either
	
	@Column(name="catage")
	private String catAge; // kitten OR adolescent OR adult or senior OR any
	
	@Column(name="breedtypecolour")
	private String breedTypeColour;
	
	@Column(name="friendlywithchild")
	private String friendlyWithChildren; // V or S or N -> very important, somewhat important, not important
	
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
	
	@Column(name="littertrained")
	private String litterTrained; // Y, N, X -> yes, no, not sure
	
	@Column(name="declawed")
	private String declawed; // Y, N, X
	
	@Column(name="firsttimeowner")
	private String firstTimeOwner; // Y, N, X
	
	@Column(name="handledifficultcat")
	private String handleDifficultCat; // Y, N, X
	
	@Column(name="medicalhandling")
	private boolean medical; // yes/no -> true/false
	
	@Column(name="kittenmedical")
	private boolean kittenHandling; // yes/no -> true/false
	
	@Column(name="nailcare")
	private String nailCare; // declawing OR scratching posts OR trimming the nails OR nails covers OR i don't know
	
	@Column(name="behaviouralissues")
	private String behaviouralIssue; // vocalization OR litter box issues OR spraying OR scratching furniture OR aggression towards people OR aggression towards other animals OR overly timid OR none
	
	@Column(name="declawcat")
	private boolean declaw; // yes/no -> true/false
	
	@Column(name="catpast")
	private String catPast;
	
	@Column(name="catinsurance")
	private boolean insurance; // yes/no -> true/false
	
	@Column(name="giveupcat")
	private String giveUpCircumstances;
	
	@Column(name="catcirucumstances")
	private String explainGiveUp;
	
	@Column(name="additionalinformation")
	private String additionalInfo;
	
	
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
	private String findOutAbout; // PetSmart OR Pet Valu OR The Body Shop OR Facebook OR Petfinder.com OR CARS Website OR Friend/Family OR Other


	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getNameOfCat()
	{
		return nameOfCat;
	}


	public void setNameOfCat(String nameOfCat)
	{
		this.nameOfCat = nameOfCat;
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


	public String getPersonCatIsFor()
	{
		return personCatIsFor;
	}


	public void setPersonCatIsFor(String personCatIsFor)
	{
		this.personCatIsFor = personCatIsFor;
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


	public boolean isCatAllergies()
	{
		return catAllergies;
	}


	public void setCatAllergies(boolean catAllergies)
	{
		this.catAllergies = catAllergies;
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


	public String getChildrenCatHandling()
	{
		return childrenCatHandling;
	}


	public void setChildrenCatHandling(String childrenCatHandling)
	{
		this.childrenCatHandling = childrenCatHandling;
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


	public boolean isCatsAllowed()
	{
		return catsAllowed;
	}


	public void setCatsAllowed(boolean catsAllowed)
	{
		this.catsAllowed = catsAllowed;
	}


	public String getRestrictions()
	{
		return restrictions;
	}


	public void setRestrictions(String restrictions)
	{
		this.restrictions = restrictions;
	}


	public String getOutdoorAreas()
	{
		return outdoorAreas;
	}


	public void setOutdoorAreas(String outdoorAreas)
	{
		this.outdoorAreas = outdoorAreas;
	}


	public String getTypeOfStreet()
	{
		return typeOfStreet;
	}


	public void setTypeOfStreet(String typeOfStreet)
	{
		this.typeOfStreet = typeOfStreet;
	}


	public String getCatHome()
	{
		return catHome;
	}


	public void setCatHome(String catHome)
	{
		this.catHome = catHome;
	}


	public String getLivingSituationChanges()
	{
		return livingSituationChanges;
	}


	public void setLivingSituationChanges(String livingSituationChanges)
	{
		this.livingSituationChanges = livingSituationChanges;
	}


	public boolean isOtherCats()
	{
		return otherCats;
	}


	public void setOtherCats(boolean otherCats)
	{
		this.otherCats = otherCats;
	}


	public String getCatsInfo()
	{
		return catsInfo;
	}


	public void setCatsInfo(String catsInfo)
	{
		this.catsInfo = catsInfo;
	}


	public String getCatsAttitude()
	{
		return catsAttitude;
	}


	public void setCatsAttitude(String catsAttitude)
	{
		this.catsAttitude = catsAttitude;
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


	public String getExpectations()
	{
		return expectations;
	}


	public void setExpectations(String expectations)
	{
		this.expectations = expectations;
	}


	public String getPurpose()
	{
		return purpose;
	}


	public void setPurpose(String purpose)
	{
		this.purpose = purpose;
	}


	public String getPrimaryCaretaker()
	{
		return primaryCaretaker;
	}


	public void setPrimaryCaretaker(String primaryCaretaker)
	{
		this.primaryCaretaker = primaryCaretaker;
	}


	public boolean isHadCats()
	{
		return hadCats;
	}


	public void setHadCats(boolean hadCats)
	{
		this.hadCats = hadCats;
	}


	public String getVacationHome()
	{
		return vacationHome;
	}


	public void setVacationHome(String vacationHome)
	{
		this.vacationHome = vacationHome;
	}


	public int getLeftAloneWeekday()
	{
		return leftAloneWeekday;
	}


	public void setLeftAloneWeekday(int leftAloneWeekday)
	{
		this.leftAloneWeekday = leftAloneWeekday;
	}


	public int getLeftAloneWeekend()
	{
		return leftAloneWeekend;
	}


	public void setLeftAloneWeekend(int leftAloneWeekend)
	{
		this.leftAloneWeekend = leftAloneWeekend;
	}


	public int getDailyExercise()
	{
		return dailyExercise;
	}


	public void setDailyExercise(int dailyExercise)
	{
		this.dailyExercise = dailyExercise;
	}


	public int getPetAdjustment()
	{
		return petAdjustment;
	}


	public void setPetAdjustment(int petAdjustment)
	{
		this.petAdjustment = petAdjustment;
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


	public String getCatAge()
	{
		return catAge;
	}


	public void setCatAge(String catAge)
	{
		this.catAge = catAge;
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


	public String getLitterTrained()
	{
		return litterTrained;
	}


	public void setLitterTrained(String litterTrained)
	{
		this.litterTrained = litterTrained;
	}


	public String getDeclawed()
	{
		return declawed;
	}


	public void setDeclawed(String declawed)
	{
		this.declawed = declawed;
	}


	public String getFirstTimeOwner()
	{
		return firstTimeOwner;
	}


	public void setFirstTimeOwner(String firstTimeOwner)
	{
		this.firstTimeOwner = firstTimeOwner;
	}


	public String getHandleDifficultCat()
	{
		return handleDifficultCat;
	}


	public void setHandleDifficultCat(String handleDifficultCat)
	{
		this.handleDifficultCat = handleDifficultCat;
	}


	public boolean isMedical()
	{
		return medical;
	}


	public void setMedical(boolean medical)
	{
		this.medical = medical;
	}


	public boolean isKittenHandling()
	{
		return kittenHandling;
	}


	public void setKittenHandling(boolean kittenHandling)
	{
		this.kittenHandling = kittenHandling;
	}


	public String getNailCare()
	{
		return nailCare;
	}


	public void setNailCare(String nailCare)
	{
		this.nailCare = nailCare;
	}


	public String getBehaviouralIssue()
	{
		return behaviouralIssue;
	}


	public void setBehaviouralIssue(String behaviouralIssue)
	{
		this.behaviouralIssue = behaviouralIssue;
	}


	public boolean isDeclaw()
	{
		return declaw;
	}


	public void setDeclaw(boolean declaw)
	{
		this.declaw = declaw;
	}


	public String getCatPast()
	{
		return catPast;
	}


	public void setCatPast(String catPast)
	{
		this.catPast = catPast;
	}


	public boolean isInsurance()
	{
		return insurance;
	}


	public void setInsurance(boolean insurance)
	{
		this.insurance = insurance;
	}


	public String getGiveUpCircumstances()
	{
		return giveUpCircumstances;
	}


	public void setGiveUpCircumstances(String giveUpCircumstances)
	{
		this.giveUpCircumstances = giveUpCircumstances;
	}


	public String getExplainGiveUp()
	{
		return explainGiveUp;
	}


	public void setExplainGiveUp(String explainGiveUp)
	{
		this.explainGiveUp = explainGiveUp;
	}


	public String getAdditionalInfo()
	{
		return additionalInfo;
	}


	public void setAdditionalInfo(String additionalInfo)
	{
		this.additionalInfo = additionalInfo;
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

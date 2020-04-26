DROP SCHEMA IF EXISTS `carsDB` ;
CREATE SCHEMA IF NOT EXISTS `carsDB` DEFAULT CHARACTER SET latin1;
USE `carsDB`;

CREATE TABLE IF NOT EXISTS id
(
	id INT(32) AUTO_INCREMENT,
    `type` VARCHAR(10),
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS volunteers 
(
	approved BOOLEAN,
	`active` BOOLEAN,
	id INT(32), 
    `password` VARCHAR(15),
    
    #NAME AND ADDRESS
    fname VARCHAR(25),
    lname VARCHAR(25),
    streetaddress VARCHAR(50),
    city VARCHAR(20),
    province VARCHAR(2),
    postalcode VARCHAR(7), # format: A1A 1A1 
    cellphone VARCHAR(12), # format: 111-111-1111
    homephone VARCHAR(12), # format: 111-111-1111
	email VARCHAR(50),
    
    #DEMOGRAPHIC INFORMATION
    dateofbirth VARCHAR(11),
    gender VARCHAR(20), # male OR female OR other OR prefer not to say
    tshirtsize VARCHAR(5),
    selfdescription VARCHAR(200),
	
    #EMERGENCY CONTACTS
	#EMERGENCY 1
    eme1fname VARCHAR(25),
    eme1lname VARCHAR(25),
    eme1relationship VARCHAR(20),
    eme1cellphone VARCHAR(12), # format: 111-111-1111
    eme1homephone VARCHAR(12), # format: 111-111-1111
    eme1email VARCHAR(50),
    
    
	#EMERGENCY 2
    eme2fname VARCHAR(25),
    eme2lname VARCHAR(25),
    eme2relationship VARCHAR(20),
    eme2cellphone VARCHAR(12), # format: 111-111-1111
    eme2homephone VARCHAR(12), # format: 111-111-1111
    eme2email VARCHAR(50),
    
    #REFERENCE CONTACTS
	#REFERENCE 1
	ref1fname VARCHAR(25),
    ref1lname VARCHAR(25),
    ref1cellphone VARCHAR(12), # format: 111-111-1111
    ref1email VARCHAR(50),
    
	#REFERENCE 2
	ref2fname VARCHAR(25),
    ref2lname VARCHAR(25),
    ref2cellphone VARCHAR(12), # format: 111-111-1111
    ref2email VARCHAR(50),
    
    emailallowed BOOLEAN,
    emailpref VARCHAR(25),
    
    PRIMARY KEY(id),
    CONSTRAINT FOREIGN KEY (id) REFERENCES id (id)
);

CREATE TABLE IF NOT EXISTS flags
(
    flagid INT(16),
    `name` VARCHAR(50),
    PRIMARY KEY (flagid)
);

INSERT INTO flags (flagid, `name`)
VALUES (1,'electronic newsletters');

INSERT INTO flags (flagid, `name`)
VALUES (2,'recruitment appeals');

INSERT INTO flags (flagid, `name`)
VALUES (3,'schedule reminders');

CREATE TABLE IF NOT EXISTS volunteerflags
(
	flagid INT(16),
    id INT(32),
    PRIMARY KEY (flagid, id),
    CONSTRAINT FOREIGN KEY (flagid) REFERENCES flags (flagid),
    CONSTRAINT FOREIGN KEY (id) REFERENCES volunteers (id)
);

CREATE TABLE IF NOT EXISTS `events` 
(
	eventid INT(32) AUTO_INCREMENT,
    `name` VARCHAR(50),
    address VARCHAR(50),
    `description` VARCHAR(100),
    coordinator VARCHAR(50),
    `date` VARCHAR(20),
    starttime VARCHAR(7),
    endtime VARCHAR(7),
    PRIMARY KEY (eventid)
);

CREATE TABLE IF NOT EXISTS eventstaff
(
    eventid INT(32),
	staffid INT(32),
    PRIMARY KEY (eventid, staffid),
    CONSTRAINT FOREIGN KEY (staffid) REFERENCES id (id),
    CONSTRAINT FOREIGN KEY (eventid) REFERENCES `events` (eventid)
);

CREATE TABLE IF NOT EXISTS fosters
(
	#PERSONAL INFORMATION
	approved BOOLEAN,
	`active` BOOLEAN, 
    id INT(32),
    `password` VARCHAR(15),
    
    fname VARCHAR(25),
    lname VARCHAR(25),
    address VARCHAR(50),
    city VARCHAR(20),
    province VARCHAR(2),
    postalcode VARCHAR(7), # format: A1A 1A1 
	homephone VARCHAR(12), # format: 111-111-1111
    cellphone VARCHAR(12), # format: 111-111-1111
	over18 BOOLEAN,
	email VARCHAR(50), 
    
    #YOUR HOME/PETS/CHILDREN
    typeofresidence VARCHAR(15),
    own BOOLEAN,
    landlordcontact VARCHAR(50),
    childreninhome BOOLEAN,
    household VARCHAR(200), 
    petallergies BOOLEAN,
    safehandlingprocedures BOOLEAN,
    ownedpets BOOLEAN,
    ownedpetdetails VARCHAR(100),
    spayedandneutered VARCHAR(100),
    doghabit VARCHAR(20),
    cathabit VARCHAR(20), 
    familyagreeance BOOLEAN,
    typeoffoster VARCHAR(35),
	typeofanimal VARCHAR(100),
    catfosterindoor BOOLEAN,
    fencedyard BOOLEAN,
    fenceheight DOUBLE,
    willingtotrain BOOLEAN,
    cratetraining BOOLEAN,
    usingacrate BOOLEAN,
    rescueanimalexp VARCHAR(200),
	willingtotaketovet BOOLEAN,
    vehicletransport BOOLEAN,
    medicateanimal BOOLEAN,
    hoursleftalone DOUBLE,
    
    ref1fname VARCHAR(25),
    ref1lname VARCHAR(25),
    ref1cellphone VARCHAR(12),
    ref1email VARCHAR(50),
    
	ref2fname VARCHAR(25),
    ref2lname VARCHAR(25),
    ref2cellphone VARCHAR(12),
    ref2email VARCHAR(50),
    
	ref3fname VARCHAR(25),
    ref3lname VARCHAR(25),
    ref3cellphone VARCHAR(12),
    ref3email VARCHAR(50),
    
    allowhomevisit BOOLEAN,
    
    PRIMARY KEY (id),
    CONSTRAINT FOREIGN KEY (id) REFERENCES id (id)
);


CREATE TABLE IF NOT EXISTS animals
(
	animalid INT(32) AUTO_INCREMENT,
    `name` VARCHAR(50),
    `date` VARCHAR(20),
    age INT(32),
    species VARCHAR(25),
    breed VARCHAR(25),
    bio VARCHAR(100),
    medicalhistory VARCHAR(100),
    `status` VARCHAR(20),
    PRIMARY KEY (animalid)
);

CREATE TABLE IF NOT EXISTS adopters
(
	animalid INT(32),
	`name` VARCHAR(50),
    email VARCHAR(50),
    cellphone VARCHAR(12),
    CONSTRAINT FOREIGN KEY (animalid) REFERENCES animals (animalid)
);


CREATE TABLE if not exists catapplication
(
	id INT(32) AUTO_INCREMENT,
    
	#APPLICANT INFORMATION
    nameofcat VARCHAR(25),
    fname VARCHAR(25),
    lname VARCHAR(25),
    address VARCHAR(50),
    city VARCHAR(20),
    province VARCHAR(20),
    postalcode VARCHAR(7), 
	homephone VARCHAR(12),
    cellphone VARCHAR(12),
	email VARCHAR(50), 
	age INT(3),
	
    #YOUR FAMILY AND LIFESTYLE
	personcatisfor VARCHAR(20),
    householdagreement BOOLEAN,
    membersintroduced BOOLEAN,
    catallergies BOOLEAN,
    howmanyadults INT(2),
    howmanychild INT(2),
    childrenages VARCHAR(25),
    childrenhandling VARCHAR(100),
    childrenvisit BOOLEAN,
    visitingfrequency VARCHAR(10),
    childrenprepared VARCHAR(100),
    familybusy VARCHAR(10),
    activefamily VARCHAR(15),
    scheduleregularity VARCHAR(15),
    familypersonality VARCHAR(50),
    plans VARCHAR(20),
    
    #YOUR HOME 
    typeofresidence VARCHAR(12),
    own BOOLEAN,
    landlordcontact VARCHAR(50),
    catsallowed BOOLEAN,
    restrictions VARCHAR(80),
    outdoorareas VARCHAR(25),
    busystreet VARCHAR(10),
    cathome VARCHAR(200),
    livingsituationchanges VARCHAR(200),
    
    #CURRENT/PREVIOUS PETS
    anycats BOOLEAN,
    catsinfo VARCHAR(20),
    catattitude VARCHAR(50),
    otherpets BOOLEAN,
    otherpetsinfo VARCHAR(50),
    spayedandneutered INT(3),
    animallocation VARCHAR(30),
    prioradoption BOOLEAN ,
    groupname VARCHAR(20),
    surrenderedanimal BOOLEAN ,
    circumstances VARCHAR(200),
    vetinfo VARCHAR(50),
    
    #NEW PET INFORMATION
    expectations VARCHAR(100),
    mainpurpose VARCHAR(30),
    primarycaretaker VARCHAR(20),
    catsprior BOOLEAN,
    vacationhome VARCHAR(100),
    leftaloneweekday INT(2),
    leftaloneweekend INT(2),
    dailyexercise INT(2),
    petadjustment INT(2),
    foodexpenses INT(5),
    vetexpenses INT(5),
    groomingexpenses INT(5),
    boardingexpenses INT(5),
    gender BOOLEAN,
    catcoat VARCHAR(10),
    catage VARCHAR(25),
    breedtypecolour VARCHAR(50),
    friendlywithchild VARCHAR(20),
    friendlywithdogs VARCHAR(20),
    friendlywithcats VARCHAR(20),
    friendlywithme VARCHAR(20),
    friendlywithvisitors VARCHAR(20),
    enjoybeinggroomed VARCHAR(20),
    enjoybeingheld VARCHAR(20),
    enjoybeingpetted VARCHAR(20),
    becalm VARCHAR(20),
    beactive VARCHAR(20),
    beplayful VARCHAR(20),
    bequiet VARCHAR(20),
    beindependant VARCHAR(20),
    wakeupatnight VARCHAR(20),
    aggressivebehaviour VARCHAR(20),
    beprotective VARCHAR(20),
    littertrained VARCHAR(1),
    declawed VARCHAR(1),
    firsttimeowner VARCHAR(1),
    handledifficultcat VARCHAR(1),
    medicalhandling BOOLEAN,
    kittenmedical BOOLEAN,
    nailcare VARCHAR(25),
    behaviouralissues VARCHAR(30),
    declawcat BOOLEAN,
    catpast VARCHAR(100),
    catinsurance BOOLEAN,
    giveupcat VARCHAR(50),
    catcirucumstances VARCHAR(100),
    additionalinformation VARCHAR(100),
    
    #REFERENCE1
    ref1fname VARCHAR(25),
    ref1lname VARCHAR(25),
    ref1relationship VARCHAR(25),
    ref1phonenumber VARCHAR(12),
    ref1email VARCHAR(50),
    
	#REFERENCE2
    ref2fname VARCHAR(25),
    ref2lname VARCHAR(25),
    ref2relationship VARCHAR(25),
    ref2phonenumber VARCHAR(12),
    ref2email VARCHAR(50),
    
    findoutanimal VARCHAR(25),
	PRIMARY KEY (id)
);

CREATE TABLE if not exists dogapplication
(	
	id INT(32) AUTO_INCREMENT,
    
	#APPLICANT INFORMATION
    nameofdog VARCHAR(25),
    fname VARCHAR(25),
    lname VARCHAR(25),
    address VARCHAR(50),
    city VARCHAR(20),
    province VARCHAR(2),
    postalcode VARCHAR(7), # format: A1A 1A1 
	homephone VARCHAR(12), # format: 111-111-1111
    cellphone VARCHAR(12), # format: 111-111-1111
	email VARCHAR(50), 
	age INT(3),
    
	#YOUR FAMILY AND LIFESTYLE
    householdagreement BOOLEAN,
    membersintroduced BOOLEAN,
    dogallergies BOOLEAN,
    howmanyadults INT(2),
    howmanychild INT(2),
    childrenages VARCHAR(50),
    childrenhandling VARCHAR(100),
    childrenvisit BOOLEAN,
    visitingfrequency VARCHAR(10),
    childrenprepared VARCHAR(100),
    familybusy VARCHAR(10),
    activefamily VARCHAR(15),
    scheduleregularity VARCHAR(15),
    familypersonality VARCHAR(100),
    plans VARCHAR(20),
    
	#YOUR HOME 
    typeofresidence VARCHAR(15),
    own BOOLEAN,
    landlordcontact VARCHAR(50),
	dogsallowed BOOLEAN,
    restrictions VARCHAR(20),
	livingsituationchanges VARCHAR(200),
    outdoorareas VARCHAR(20),
    fencetype VARCHAR(25),
    fenceheight DOUBLE,
    dogaddons VARCHAR(20), 
    
	#CURRENT/PREVIOUS PETS
    anydogs BOOLEAN,
    dogsinfo VARCHAR(50),
    otherpets BOOLEAN,
    otherpetsinfo VARCHAR(50),
    spayedandneutered INT(3),
    animallocation VARCHAR(100),
    prioradoption BOOLEAN ,
    groupname VARCHAR(20),
    surrenderedanimal BOOLEAN ,
    circumstances VARCHAR(200),
    vetinfo VARCHAR(50),
    
    #NEW PET INFORMATION
    dogprimarycaretaker VARCHAR(50),
    dogsprior BOOLEAN,
    housebroken BOOLEAN,
    dogcorrection VARCHAR(100),
    dogstayvacation VARCHAR(30),
    dogstayday VARCHAR(50),
    dogstaynight VARCHAR(50),
    leftaloneweek DOUBLE,
    leftaloneweekend DOUBLE,
    petadjustment DOUBLE,
    dogactivties VARCHAR(90),
    foodexpenses DOUBLE,
    vetexpenses DOUBLE,
    groomingexpenses DOUBLE,
    boardingexpenses DOUBLE,
    gender VARCHAR(6),
    dogcoat VARCHAR(15),
    dogage VARCHAR(10),
    breedtypecolour VARCHAR(50),
    friendlywithchild VARCHAR(1),
    friendlywithdogs VARCHAR(1),
    friendlywithcats VARCHAR(1),
    friendlywithme VARCHAR(1),
    friendlywithvisitors VARCHAR(1),
    enjoybeinggroomed VARCHAR(1),
    enjoybeingheld VARCHAR(1),
    enjoybeingpetted VARCHAR(1),
    becalm VARCHAR(1),
    beactive VARCHAR(1),
    beplayful VARCHAR(1),
    bequiet VARCHAR(1),
    beindependant VARCHAR(1),
    wakeupatnight VARCHAR(1),
    aggressivebehaviour VARCHAR(1),
    beprotective VARCHAR(1),
    housetrained VARCHAR(1),
    obediencetrained VARCHAR(1),
    firsttimeowner VARCHAR(1),
    obedienceknowledge VARCHAR(1),
    difficultdog VARCHAR(1),
    trainingclasses VARCHAR(1),
    dogexpectations VARCHAR(200),
    dogmedical BOOLEAN,
    dogpast VARCHAR(100),
    doginsurance BOOLEAN,
    dogmaturing BOOLEAN,
    giveupdog VARCHAR(100),
    dogcircumstances VARCHAR(100),
    
    #REFERENCE1
    ref1fname VARCHAR(25),
    ref1lname VARCHAR(25),
    ref1relationship VARCHAR(25),
    ref1phonenumber VARCHAR(12),
    ref1email VARCHAR(50),
    
	#REFERENCE2
    ref2fname VARCHAR(25),
    ref2lname VARCHAR(25),
    ref2relationship VARCHAR(25),
    ref2phonenumber VARCHAR(12),
    ref2email VARCHAR(50),
    
    findoutanimal VARCHAR(25),
    PRIMARY KEY (id)
);
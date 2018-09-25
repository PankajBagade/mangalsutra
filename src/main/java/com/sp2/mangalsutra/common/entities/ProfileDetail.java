package com.sp2.mangalsutra.common.entities;


import java.sql.Date;
import java.time.ZonedDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "profile_master_tbl")
public class ProfileDetail {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", unique = true, insertable = false, updatable = false)
	@Type(type = "pg-uuid")
	private UUID id;
	
	@OneToOne(mappedBy = "profileDetail")
    private LoginSignup login;
	
	@Column(name = "profile_id")	
	private String profileId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "date_of_birth")
	private Date dob;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "work_with")
	private String workWith;
	
	@Column(name = "income")
	private String income;
	
	@Column(name = "matial_status")
	private String maritalStaus;
	
	@Column(name = "complexion")
	private String complexion;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "build_type")
	private String buildType;
	
	@Column(name = "location ")
	private String location;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "caste")
	private String caste;
	
	@Column(name = "sub_caste")
	private String subCaste;
	
	@Column(name = "religion")
	private String  religion;
	
	@Column(name = "image_path")
	private String imgPath;
	
	@Column(name = "about me")
	private String aboutMe; 
	
	@Column(name = "hobbies")
	private String hobbies;
	
	@Column(name = "habbits")
	private String hobits;
	
	@Column(name = "rashi")
	private String rashi;
	
	@Column(name = "mother_tounge")
	private String motherTounge;
	
	@Column(name = "highest_education")
	private String highestEducation;
	
	@Column(name = "physical_disability")
	private String physicalDisable;
	
	@Column(name = "college_name")
	private String collegeName;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "diet")
	private String diet;
	
	@Column(name = "drink_and_smoke")
	private String drinkSmoke;
	
    @Column(name = "request_date")
    private Date requestDate;

    @Column(name = "request_status")
    private String requestStatus;

    @Column(name = "activation_date")
    private Date activationDate;


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LoginSignup getLogin() {
		return login;
	}

	public void setLogin(LoginSignup login) {
		this.login = login;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWorkWith() {
		return workWith;
	}

	public void setWorkWith(String workWith) {
		this.workWith = workWith;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getMaritalStaus() {
		return maritalStaus;
	}

	public void setMaritalStaus(String maritalStaus) {
		this.maritalStaus = maritalStaus;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getHobits() {
		return hobits;
	}

	public void setHobits(String hobits) {
		this.hobits = hobits;
	}

	public String getRashi() {
		return rashi;
	}

	public void setRashi(String rashi) {
		this.rashi = rashi;
	}

	public String getMotherTounge() {
		return motherTounge;
	}

	public void setMotherTounge(String motherTounge) {
		this.motherTounge = motherTounge;
	}

	public String getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getPhysicalDisable() {
		return physicalDisable;
	}

	public void setPhysicalDisable(String physicalDisable) {
		this.physicalDisable = physicalDisable;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getDrinkSmoke() {
		return drinkSmoke;
	}

	public void setDrinkSmoke(String drinkSmoke) {
		this.drinkSmoke = drinkSmoke;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}
	
}




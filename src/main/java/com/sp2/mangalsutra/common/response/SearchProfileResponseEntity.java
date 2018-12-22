package com.sp2.mangalsutra.common.response;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.OneToOne;

import com.sp2.mangalsutra.common.entities.LoginSignup;

public class SearchProfileResponseEntity {
	
	private String profileId;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private Date dob;
	
	private String emailId;
	
	private String workWith;
	
	private String income;
	
	private String maritalStaus;
	
	private String complexion;
	
	private String height;
	
	private String buildType;
	
	private String location;
	
	private String nationality;
	
	private String caste;
	
	private String subCaste;
	
	private String  religion;
	
	private String imgPath;
	
	private String aboutMe; 
	
	private String hobbies;
	
	private String habits;
	
	private String rashi;
	
	private String motherTounge;
	
	private String highestEducation;
	
	private String physicalDisable;
	
	private String collegeName;
	
	private String designation;
	
	private String diet;
	
	private String drinkSmoke;

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

	public String getHabits() {
		return habits;
	}

	public void setHabits(String habits) {
		this.habits = habits;
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

	@Override
	public String toString() {
		return "SearchProfileResponseEntity [profileId=" + profileId
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", dob=" + dob + ", emailId="
				+ emailId + ", workWith=" + workWith + ", income=" + income
				+ ", maritalStaus=" + maritalStaus + ", complexion="
				+ complexion + ", height=" + height + ", buildType="
				+ buildType + ", location=" + location + ", nationality="
				+ nationality + ", caste=" + caste + ", subCaste=" + subCaste
				+ ", religion=" + religion + ", imgPath=" + imgPath
				+ ", aboutMe=" + aboutMe + ", hobbies=" + hobbies + ", habits="
				+ habits + ", rashi=" + rashi + ", motherTounge="
				+ motherTounge + ", highestEducation=" + highestEducation
				+ ", physicalDisable=" + physicalDisable + ", collegeName="
				+ collegeName + ", designation=" + designation + ", diet="
				+ diet + ", drinkSmoke=" + drinkSmoke + "]";
	}
	
	

}

package com.sp2.mangalsutra.common.request;

import java.sql.Date;

public class SearchProfileFilterRequestEntity {
	
	private String profileId;
	
	private String emailId;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private Date dob;
	
	private String location;
	
	private String nationality;
	
	private String caste;
	
	private String subCaste;
	
	private String  religion;
	
	private String motherTounge;
	
	private String highestEducation;
	
	private String income;
	
	private String designation;
	
	private String complexion;
	
	private String height;
	
	private String physicalDisable;
	
	private String drinkSmoke;
	
	private String diet;

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	public String getPhysicalDisable() {
		return physicalDisable;
	}

	public void setPhysicalDisable(String physicalDisable) {
		this.physicalDisable = physicalDisable;
	}

	public String getDrinkSmoke() {
		return drinkSmoke;
	}

	public void setDrinkSmoke(String drinkSmoke) {
		this.drinkSmoke = drinkSmoke;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	@Override
	public String toString() {
		return "SearchProfileFilterRequestEntity [profileId=" + profileId
				+ ", emailId=" + emailId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", dob="
				+ dob + ", location=" + location + ", nationality="
				+ nationality + ", caste=" + caste + ", subCaste=" + subCaste
				+ ", religion=" + religion + ", motherTounge=" + motherTounge
				+ ", highestEducation=" + highestEducation + ", income="
				+ income + ", designation=" + designation + ", complexion="
				+ complexion + ", height=" + height + ", physicalDisable="
				+ physicalDisable + ", drinkSmoke=" + drinkSmoke + ", diet="
				+ diet + "]";
	}
	
}

package com.sp2.mangalsutra.common.request;

import java.sql.Date;
import java.util.UUID;

import org.springframework.http.HttpEntity;

public class SignupRequestEntity extends HttpEntity{
	
	private UUID id;
	 
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String phoneNumber;
	
	private String password;
	
	private String gender;
	
	private Date  dob;
	
	private String otp;
	
	public SignupRequestEntity(){
		
	}

	public SignupRequestEntity(UUID id, String firstName, String lastName,
			String emailId, String phoneNumber, String password, String gender,
			Date dob, String otp) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.otp = otp;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "SignupRequestEntity [firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", password=" + password
				+ ", gender=" + gender + ", dob=" + dob + ", otp=" + otp + "]";
	}
	
	
}

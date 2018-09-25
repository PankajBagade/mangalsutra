package com.sp2.mangalsutra.common.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login_credentials")
public class LoginSignup implements Serializable{
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "password")
	private String password; 
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "otp")
	private String otp;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profile_table_id")
    private ProfileDetail profileDetail;  
	
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
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public ProfileDetail getProfileDetail() {
		return profileDetail;
	}

	public void setProfileDetail(ProfileDetail profileDetail) {
		this.profileDetail = profileDetail;
	}
	
	
}

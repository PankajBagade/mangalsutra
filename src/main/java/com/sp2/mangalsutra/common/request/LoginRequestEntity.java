package com.sp2.mangalsutra.common.request;

public class LoginRequestEntity {
	
	private String emailIdOrPhoneNumber;
	
	private String password;

	public String getEmailIdOrPhoneNumber() {
		return emailIdOrPhoneNumber;
	}

	public void setEmailIdOrPhoneNumber(String emailIdOrPhoneNumber) {
		this.emailIdOrPhoneNumber = emailIdOrPhoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

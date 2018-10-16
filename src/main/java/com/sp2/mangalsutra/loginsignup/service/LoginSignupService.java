package com.sp2.mangalsutra.loginsignup.service;

import com.sp2.mangalsutra.common.entities.LoginSignup;
import com.sp2.mangalsutra.common.request.ProfileRequestEntity;
import com.sp2.mangalsutra.common.request.SignupRequestEntity;
import com.sp2.mangalsutra.common.response.ProfileResponseEntity;
import com.sp2.mangalsutra.common.response.SignupResponseEntity;

public interface LoginSignupService {
	
	public SignupResponseEntity createProfile(SignupRequestEntity signupRequestEntity);
	
	public LoginSignup isEmailIdExist(String emailId);
		
	public LoginSignup isPhoneNumberExist(String phoneNumber);
	
	public LoginSignup saveOtp(SignupRequestEntity signupRequestEntity);
	
	public Boolean validateOtp(SignupRequestEntity signupRequestEntity);
	
	public ProfileResponseEntity updateProfile(ProfileRequestEntity profileRequestEntity);
	
	public ProfileResponseEntity deactivateProfile(String profileId); 
	
}

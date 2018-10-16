package com.sp2.mangalsutra.login.controller;

import javassist.bytecode.stackmap.BasicBlock.Catch;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sp2.mangalsutra.common.entities.LoginSignup;
import com.sp2.mangalsutra.common.repositories.LoginSignupRepository;
import com.sp2.mangalsutra.common.request.ProfileRequestEntity;
import com.sp2.mangalsutra.common.request.SignupRequestEntity;
import com.sp2.mangalsutra.common.response.ProfileResponseEntity;
import com.sp2.mangalsutra.common.response.SignupResponseEntity; 
import com.sp2.mangalsutra.common.util.OTPGenrator;
import com.sp2.mangalsutra.loginsignup.exception.EmailAlreadyExistException;
import com.sp2.mangalsutra.loginsignup.exception.OtpNotMatchException;
import com.sp2.mangalsutra.loginsignup.exception.UserNotFound;
import com.sp2.mangalsutra.loginsignup.service.LoginSignupService;


@RestController
@RequestMapping(value = "/")
public class LoginSignupController {
	
	private static final Logger  logger = LoggerFactory.getLogger(LoginSignupController.class);
	
	@Autowired
	LoginSignupService loginSignupService;
	
	@RequestMapping(value = "signup/generateotp", method = RequestMethod.POST)
	public ResponseEntity<SignupResponseEntity> generateOtp(@RequestBody SignupRequestEntity signupRequest){
		String otp = OTPGenrator.generateOtp();
		signupRequest.setOtp(otp);
		loginSignupService.saveOtp(signupRequest);
		
		return null;
	}
	
	@RequestMapping(value = "signup/emailid", method = RequestMethod.GET)
	public ResponseEntity<LoginSignup> findByEmailId(String emailId){
		try{
			LoginSignup loginDetail = loginSignupService.isEmailIdExist(emailId);
		}catch(EmailAlreadyExistException ex){
			
		}	
		return null;
	}
	
	@RequestMapping(value = "signup/phonenumber", method = RequestMethod.GET)
	public ResponseEntity<LoginSignup> findByPhoneNumber(String phoneNumber){
		try{
			LoginSignup loginDetail = loginSignupService.isPhoneNumberExist(phoneNumber);
		}catch(Exception ex){
			
		}
		return null;
	}
	
	@RequestMapping(value = "signup/createprofile", method = RequestMethod.POST)
	public ResponseEntity<SignupResponseEntity> create(@RequestBody SignupRequestEntity signupRequest){
		try{
			Boolean validOtp = loginSignupService.validateOtp(signupRequest);
			if(validOtp){
				loginSignupService.createProfile(signupRequest);
			}
		}catch(OtpNotMatchException ex){
			
		}
		return null;
	}
	
	@RequestMapping(value ="profile/editprofile", method= RequestMethod.POST)
	public ResponseEntity<ProfileResponseEntity> update(@RequestBody ProfileRequestEntity profileRequest){
		try{
			if(profileRequest.getProfileId() != null){
				ProfileResponseEntity response =  loginSignupService.updateProfile(profileRequest);
			}
		}catch(UserNotFound ex){
			ex.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
		//return profileResponseEntity;
	}

	
	@RequestMapping(value = "profile/deactivateProfile/{profileId}", method = RequestMethod.DELETE)
	public ResponseEntity<ProfileResponseEntity> deactivate(@PathVariable("profileId") String profileId){
		try{
			if(profileId != null){
				ProfileResponseEntity response =  loginSignupService.deactivateProfile(profileId);
			}
		}catch(UserNotFound ex){
			
		}catch(Exception ex){
			
		}
		return null;
		
	}
}

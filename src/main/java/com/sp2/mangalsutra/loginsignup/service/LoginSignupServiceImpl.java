package com.sp2.mangalsutra.loginsignup.service;



import org.springframework.beans.factory.annotation.Autowired;

import com.sp2.mangalsutra.common.entities.LoginSignup;
import com.sp2.mangalsutra.common.repositories.LoginSignupRepository;
import com.sp2.mangalsutra.common.request.SignupRequestEntity;
import com.sp2.mangalsutra.common.response.SignupResponseEntity; 
import com.sp2.mangalsutra.loginsignup.exception.EmailAlreadyExistException;
import com.sp2.mangalsutra.loginsignup.exception.OtpNotMatchException;
import com.sp2.mangalsutra.loginsignup.exception.PhoneNumberExistException;
import com.sp2.mangalsutra.loginsignup.mapper.SignupMapper;

public class LoginSignupServiceImpl implements LoginSignupService{
	
	@Autowired
	LoginSignupRepository loginSignupRepository;

	@Override
	public SignupResponseEntity createProfile(SignupRequestEntity signupRequestEntity) {
		
	}

	@Override
	public LoginSignup isEmailIdExist(String emailId) {
		LoginSignup foundEmailId =  loginSignupRepository.findByEmailId(emailId);
		if(foundEmailId != null){
			throw new EmailAlreadyExistException("EmailId already exist!");
		}
		return foundEmailId;
	}

	@Override
	public LoginSignup isPhoneNumberExist(String phoneNumber) {
		LoginSignup  foundPhoneNumber = loginSignupRepository.findByPhoneNumber(phoneNumber);
		if(foundPhoneNumber != null){
			throw new PhoneNumberExistException("Phone Number already exist!");
		}
		return foundPhoneNumber;
	}

	@Override
	public LoginSignup saveOtp(SignupRequestEntity signupRequestEntity) {
		LoginSignup signupWithOtp = SignupMapper.fromRequestEntity(signupRequestEntity);
		LoginSignup loginSignup = loginSignupRepository.save(signupWithOtp);
		loginSignup.setOtp("");
		if(loginSignup != null){
			//throw new ;
		}
		return loginSignup;
	}

	@Override
	public Boolean validateOtp(SignupRequestEntity signupRequestEntity) {
		LoginSignup loginSignup = loginSignupRepository.findByEmailId(signupRequestEntity.getEmailId());
		if(!loginSignup.getOtp().equals(signupRequestEntity.getOtp())){
			throw new OtpNotMatchException("OTP not match!");
		}
		return true;
	}
	
	
	
}

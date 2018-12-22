package com.sp2.mangalsutra.loginsignup.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.sp2.mangalsutra.common.entities.LoginSignup;
import com.sp2.mangalsutra.common.entities.ProfileDetail;
import com.sp2.mangalsutra.common.repositories.LoginSignupRepository;
import com.sp2.mangalsutra.common.repositories.ProfileDetailsRepository;
import com.sp2.mangalsutra.common.request.LoginRequestEntity;
import com.sp2.mangalsutra.common.request.ProfileRequestEntity;
import com.sp2.mangalsutra.common.request.SignupRequestEntity;
import com.sp2.mangalsutra.common.response.ProfileResponseEntity;
import com.sp2.mangalsutra.common.response.SignupResponseEntity; 
import com.sp2.mangalsutra.loginsignup.exception.EmailAlreadyExistException;
import com.sp2.mangalsutra.loginsignup.exception.InvalidUserNamePasswordException;
import com.sp2.mangalsutra.loginsignup.exception.OtpNotMatchException;
import com.sp2.mangalsutra.loginsignup.exception.PhoneNumberExistException;
import com.sp2.mangalsutra.loginsignup.exception.UserNotFound;
import com.sp2.mangalsutra.loginsignup.mapper.ProfileMapper;
import com.sp2.mangalsutra.loginsignup.mapper.SignupMapper;

public class LoginSignupServiceImpl implements LoginSignupService{
	
	@Autowired
	LoginSignupRepository loginSignupRepository;
	
	@Autowired
	ProfileDetailsRepository profileDetailsRepository;
	
	@Autowired
	private JavaMailSender sender;

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
		if(loginSignup == null){
			//throw new ;
		}
		return loginSignup;
	}
	
	@Override
	public String sendOtpViaEmail(String Otp, String emailId) {
		try{
			sendEmail(Otp,emailId);
			return "Email Send Succesfully";
		}catch(Exception ex){
			return "Problem while sending email"; 
		}
		
	}

	private void sendEmail(String otp, String emailId) throws MessagingException {
		MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        
        helper.setTo(emailId);
        helper.setText("Your  OTP is " + otp);
        helper.setSubject("Otp for registration");
        
        sender.send(message);		
	}

	@Override
	public Boolean validateOtp(SignupRequestEntity signupRequestEntity) {
		LoginSignup loginSignup = loginSignupRepository.findByEmailId(signupRequestEntity.getEmailId());
		if(!loginSignup.getOtp().equals(signupRequestEntity.getOtp())){
			throw new OtpNotMatchException("OTP not match!");
		}
		return true;
	}
	
	@Override
	public SignupResponseEntity createProfile(SignupRequestEntity signupRequestEntity) {
		LoginSignup signup = SignupMapper.fromRequestEntity(signupRequestEntity);
		LoginSignup response = loginSignupRepository.save(signup);
		SignupResponseEntity signupResponse = SignupMapper.toResponseEntity(response); 
		
		return signupResponse;
	}

	@Override
	public ProfileResponseEntity updateProfile(ProfileRequestEntity profileRequestEntity) {
		ProfileDetail profileDetail = loginSignupRepository.findByProfileId(profileRequestEntity.getProfileId());
		if(profileDetail == null){
			throw new UserNotFound("User not found");
		}
		ProfileDetail profileUpdated = ProfileMapper.toUpdateDetail(profileDetail,profileRequestEntity);
		ProfileDetail profileDetails = profileDetailsRepository.save(profileUpdated);
		ProfileResponseEntity response = ProfileMapper.toResponseEntity(profileDetails);
	    
		return response;
	}

	@Override
	public ProfileResponseEntity deactivateProfile(String profileId) {
		ProfileDetail profileDetail =  loginSignupRepository.findByProfileId(profileId);
		profileDetail.setIsProfileActive(Boolean.FALSE);
		ProfileDetail updatedPropfile = profileDetailsRepository.save(profileDetail);
        ProfileResponseEntity response = ProfileMapper.toResponseEntity(updatedPropfile);
	    
		return response;
	}

	@Override
	public LoginSignup validateLoginCredential(LoginRequestEntity loginRequestEntity) {
		LoginSignup login = loginSignupRepository.findByEmailIdOrPhoneNumber(loginRequestEntity.getEmailIdOrPhoneNumber());
		if(login != null){
			if(!login.getPassword().equals(loginRequestEntity.getPassword())){
				throw new InvalidUserNamePasswordException("Invalid Password");
			} 
		}else{
			throw new InvalidUserNamePasswordException("Invalid UserName");
		}
		
		return login;
	}

	
}

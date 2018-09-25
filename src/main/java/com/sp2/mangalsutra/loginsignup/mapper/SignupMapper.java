package com.sp2.mangalsutra.loginsignup.mapper;



import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sp2.mangalsutra.common.entities.LoginSignup;
import com.sp2.mangalsutra.common.entities.ProfileDetail;
import com.sp2.mangalsutra.common.request.SignupRequestEntity;
import com.sp2.mangalsutra.common.response.SignupResponseEntity;

public class SignupMapper {
	private static final Logger logger = LoggerFactory.getLogger(SignupMapper.class);
	
	public static LoginSignup fromRequestEntity(SignupRequestEntity request){
		LoginSignup signup = new LoginSignup();
		ProfileDetail profileDetail = new ProfileDetail();
		
		signup.setEmailId(request.getEmailId());
		signup.setPassword(request.getPassword());
		signup.setPhoneNumber(request.getPhoneNumber()); 
		profileDetail.setFirstName(request.getFirstName());
		profileDetail.setLastName(request.getLastName());
		profileDetail.setDob(request.getDob());
		profileDetail.setGender(request.getGender());
		//profileDetail.setRequestDate();
		profileDetail.setRequestStatus("PENDING");
		profileDetail.setLogin(signup);
		signup.setProfileDetail(profileDetail);
		
		return signup;
	}
	
	public static SignupResponseEntity toResponseEntity(LoginSignup signup){
		SignupResponseEntity response = new SignupResponseEntity();
		
		//response.setId();
		response.setEmailId(signup.getEmailId());
		response.setFirstName(signup.getProfileDetail().getFirstName());
		response.setLastName(signup.getProfileDetail().getLastName());
		response.setDob(signup.getProfileDetail().getDob());
		response.setGender(signup.getProfileDetail().getGender());
		response.setRequestDate(signup.getProfileDetail().getRequestDate());
		response.setRequestStatus(signup.getProfileDetail().getRequestStatus());
		
		return response;
		
	}
}

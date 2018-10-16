package com.sp2.mangalsutra.common.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp2.mangalsutra.common.entities.LoginSignup;
import com.sp2.mangalsutra.common.entities.ProfileDetail;



public interface LoginSignupRepository extends JpaRepository<LoginSignup,UUID>{
	
	public LoginSignup findByEmailId(String emailId);
	
	public LoginSignup findByPhoneNumber(String PhoneNumber);
	
	public ProfileDetail findByProfileId(String profileId);
}

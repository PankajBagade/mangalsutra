package com.sp2.mangalsutra.common.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp2.mangalsutra.common.entities.LoginSignup;



public interface LoginSignupRepository extends JpaRepository<LoginSignup,UUID>{
	
	public LoginSignup findByEmailId(String emailId);
	
	public LoginSignup findByPhoneNumber(String PhoneNumber);
}

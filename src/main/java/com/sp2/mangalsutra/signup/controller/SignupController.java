package com.sp2.mangalsutra.signup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp2.mangalsutra.common.request.SignupRequestEntity;
import com.sp2.mangalsutra.common.response.SignupResponseEntity;


@RestController
@RequestMapping(value = "signup")
public class SignupController {
	
	private static final Logger  logger = LoggerFactory.getLogger(SignupController.class);
	
	public ResponseEntity<SignupResponseEntity> create(SignupRequestEntity request){
		
	}
	
}

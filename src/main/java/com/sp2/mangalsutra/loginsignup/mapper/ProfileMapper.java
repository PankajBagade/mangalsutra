package com.sp2.mangalsutra.loginsignup.mapper;


import com.sp2.mangalsutra.common.entities.ProfileDetail;
import com.sp2.mangalsutra.common.request.ProfileRequestEntity;
import com.sp2.mangalsutra.common.response.ProfileResponseEntity;

public class ProfileMapper {
	
	public static ProfileDetail fromRequestEntity(ProfileRequestEntity request){
		ProfileDetail profileDetail = new ProfileDetail();
		profileDetail.setId(request.getId());
		profileDetail.setProfileId(request.getProfileId());
		profileDetail.setFirstName(request.getFirstName());
		profileDetail.setLastName(request.getLastName());
		profileDetail.setGender(request.getGender());
		profileDetail.setDob(request.getDob());
		profileDetail.setEmailId(request.getEmailId());
		profileDetail.setWorkWith(request.getWorkWith());
		profileDetail.setIncome(request.getIncome());
		profileDetail.setMaritalStaus(request.getMaritalStaus());
		profileDetail.setComplexion(request.getComplexion());
		profileDetail.setHeight(request.getHeight());
		profileDetail.setBuildType(request.getBuildType());
		profileDetail.setLocation(request.getLocation());
		profileDetail.setNationality(request.getNationality());
		profileDetail.setCaste(request.getCaste());
		profileDetail.setSubCaste(request.getSubCaste());
		profileDetail.setReligion(request.getReligion());
		profileDetail.setImgPath(request.getImgPath());
		profileDetail.setAboutMe(request.getAboutMe());
		profileDetail.setHobbies(request.getHobbies());
		profileDetail.setHabits(request.getHabits());
		profileDetail.setRashi(request.getRashi());
		profileDetail.setMotherTounge(request.getMotherTounge());
		profileDetail.setHighestEducation(request.getHighestEducation());
		profileDetail.setPhysicalDisable(request.getPhysicalDisable());
		profileDetail.setCollegeName(request.getCollegeName());
		profileDetail.setDesignation(request.getDesignation());
		profileDetail.setDiet(request.getDiet());
		profileDetail.setDrinkSmoke(request.getDrinkSmoke());
		profileDetail.setRequestDate(request.getRequestDate());
		profileDetail.setRequestStatus(request.getRequestStatus());
		profileDetail.setActivationDate(request.getActivationDate());
		
		return profileDetail;		
	}
	
	
	public static ProfileResponseEntity toResponseEntity(ProfileDetail profileDetail){
		
		ProfileResponseEntity response = new ProfileResponseEntity();
		response.setId(profileDetail.getId());
		profileDetail.setProfileId(profileDetail.getProfileId());
		response.setFirstName(profileDetail.getFirstName());
		response.setLastName(profileDetail.getLastName());
		response.setGender(profileDetail.getGender());
		response.setDob(profileDetail.getDob());
		response.setEmailId(profileDetail.getEmailId());
		response.setWorkWith(profileDetail.getWorkWith());
		response.setIncome(profileDetail.getIncome());
		response.setMaritalStaus(profileDetail.getMaritalStaus());
		response.setComplexion(profileDetail.getComplexion());
		response.setHeight(profileDetail.getHeight());
		response.setBuildType(profileDetail.getBuildType());
		response.setLocation(profileDetail.getLocation());
		response.setNationality(profileDetail.getNationality());
		response.setCaste(profileDetail.getCaste());
		response.setSubCaste(profileDetail.getSubCaste());
		response.setReligion(profileDetail.getReligion());
		response.setImgPath(profileDetail.getImgPath());
		response.setAboutMe(profileDetail.getAboutMe());
		response.setHobbies(profileDetail.getHobbies());
		response.setHabits(profileDetail.getHabits());
		response.setRashi(profileDetail.getRashi());
		response.setMotherTounge(profileDetail.getMotherTounge());
		response.setHighestEducation(profileDetail.getHighestEducation());
		response.setPhysicalDisable(profileDetail.getPhysicalDisable());
		response.setCollegeName(profileDetail.getCollegeName());
		response.setDesignation(profileDetail.getDesignation());
		response.setDiet(profileDetail.getDiet());
		response.setDrinkSmoke(profileDetail.getDrinkSmoke());
		response.setRequestDate(profileDetail.getRequestDate());
		response.setRequestStatus(profileDetail.getRequestStatus());
		response.setActivationDate(profileDetail.getActivationDate());
		
		
		return response;
	}
	
	public static ProfileDetail toUpdateDetail(ProfileDetail profileDetail, ProfileRequestEntity request){
		profileDetail.setId(request.getId());
		profileDetail.setProfileId(request.getProfileId());
		profileDetail.setFirstName(request.getFirstName());
		profileDetail.setLastName(request.getLastName());
		profileDetail.setGender(request.getGender());
		profileDetail.setDob(request.getDob());
		profileDetail.setEmailId(request.getEmailId());
		profileDetail.setWorkWith(request.getWorkWith());
		profileDetail.setIncome(request.getIncome());
		profileDetail.setMaritalStaus(request.getMaritalStaus());
		profileDetail.setComplexion(request.getComplexion());
		profileDetail.setHeight(request.getHeight());
		profileDetail.setBuildType(request.getBuildType());
		profileDetail.setLocation(request.getLocation());
		profileDetail.setNationality(request.getNationality());
		profileDetail.setCaste(request.getCaste());
		profileDetail.setSubCaste(request.getSubCaste());
		profileDetail.setReligion(request.getReligion());
		profileDetail.setImgPath(request.getImgPath());
		profileDetail.setAboutMe(request.getAboutMe());
		profileDetail.setHobbies(request.getHobbies());
		profileDetail.setHabits(request.getHabits());
		profileDetail.setRashi(request.getRashi());
		profileDetail.setMotherTounge(request.getMotherTounge());
		profileDetail.setHighestEducation(request.getHighestEducation());
		profileDetail.setPhysicalDisable(request.getPhysicalDisable());
		profileDetail.setCollegeName(request.getCollegeName());
		profileDetail.setDesignation(request.getDesignation());
		profileDetail.setDiet(request.getDiet());
		profileDetail.setDrinkSmoke(request.getDrinkSmoke());
		profileDetail.setRequestDate(request.getRequestDate());
		profileDetail.setRequestStatus(request.getRequestStatus());
		profileDetail.setActivationDate(request.getActivationDate());
		
		return profileDetail;	
	}

}


package com.sp2.mangalsutra.common.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp2.mangalsutra.common.entities.ProfileDetail;

public interface ProfileDetailsRepository extends JpaRepository<ProfileDetail, UUID> {
	
}

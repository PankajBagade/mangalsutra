package com.sp2.mangalsutra.common.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "response_collected_queue")
public class UnlockProfileResponse implements Serializable{
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", unique = true, insertable = false, updatable = false)
	@Type(type = "pg-uuid")
	private UUID id;
	
	@Column(name = "requester_id")
	private String requesterProfileId;
	
	@Column(name = "requestee_id")
	private String requesteeProfileId;
	
	@Column(name = "unlock_date")
	private String unlockDate;
} 
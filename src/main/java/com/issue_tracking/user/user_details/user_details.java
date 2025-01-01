package com.issue_tracking.user.user_details;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class user_details 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID")
	private long address_id;
	
	@Column(name = "USER_ID", unique = true)
	private String user_id;
	
	@Column(name = "ADDRESS1")
	private String address1;
	
	@Column(name = "ADDRESS2")
	private String address2;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "DISTRICT")
	private String dist;
	
	@Column(name = "PIN")
	private String pin;
	
	@Column(name = "AADHAR")
	private String aadhar;
	
	@Column(name = "PAN")
	private String pan;
	
	@Column(name = "CRE_USER")
	@CreatedBy
	private String cre_user;
	
	@Column(name = "CRE_DATE")
	@CreationTimestamp
	private LocalDateTime cre_date;
	
	@Column(name = "MOD_USER")
	@LastModifiedBy
	private String mod_user;
	
	@Column(name = "MOD_DATE")
	@UpdateTimestamp
	private String mod_date;
}

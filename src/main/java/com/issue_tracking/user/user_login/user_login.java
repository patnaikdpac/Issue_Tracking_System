package com.issue_tracking.user.user_login;

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
public class user_login 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LOGIN_ID")
	private long login_id;
	
	@Column(name = "USER_ID", unique = true)
	private String user_id;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "STATUS")
	private int status;
	
	@Column(name = "ROLE")
	private String role;
	
	@Column(name = "PRIVILEGE")
	private String privilege;
	
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

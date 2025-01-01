package com.issue_tracking.user.user_log;

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
public class user_log 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LOG_ID")
	private long log_id;
	
	@Column(name = "USER_ID", unique = true)
	private String user_id;
	
	@Column(name = "LOGIN_TIME")
	private LocalDateTime login_time;
	
	@Column(name = "LOGOUT_TIME")
	private LocalDateTime logout_time;
	
	@Column(name = "TOKEN")
	private String token;
	
	@Column(name = "USER_LOGIN_STATUS")
	private int user_login_status;
	
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

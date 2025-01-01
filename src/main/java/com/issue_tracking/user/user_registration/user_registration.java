package com.issue_tracking.user.user_registration;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class user_registration 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REG_ID")
	private long reg_id;
	
	@Column(name = "USER_ID", unique = true)
	private String userId;
	
	@Column(name = "FIRST_NAME")
	private String first_name;
	
	@Column(name = "LAST_NAME")
	private String last_name;
	
	@Column(name = "MAIL")
	private String mail;
	
	@Column(name = "MOBILE")
	private String mobile;
	
	@Column(name = "ALTERNATE_MOBILE")
	private String alternate_mobile;
	
	@Column(name = "DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name = "GENDER")
	private String gender;
	
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
	private LocalDateTime mod_date;
	
//	@PrePersist
//	public void generateUserId()
//	{
//		String fullName = (first_name + last_name).toLowerCase();
//		String namePart = fullName.length()>6 ? fullName.substring(0,6):fullName;
//		
//		String regIdWithZeros = String.format("%05d",reg_id);
//		this.userId = namePart + regIdWithZeros;
//	}
	

}

package com.issue_tracking.user.user_registration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class user_registration_service 
{
	@Autowired
	private userRegistrationDao userRegistrationDao;
	
	public user_registration saveUser(user_registration registration)
	{
		return userRegistrationDao.save(registration);
	}
	
	public Optional<user_registration> getUserByUserId(String userId)
	{
		return userRegistrationDao.findByUserId(userId);
	}
}

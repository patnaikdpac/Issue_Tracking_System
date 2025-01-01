package com.issue_tracking.user.user_registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@Transactional
@RestController
@RequestMapping("/registration")
public class user_registration_controller 
{
	@Autowired
	private userRegistrationDao userRegistrationDao;
	
	//Create a new user
	@PostMapping("/register")
	public ResponseEntity<user_registration> createUser(@RequestBody user_registration user_registration) 
	{
		//TODO: process POST request
		user_registration savedUser = userRegistrationDao.save(user_registration);
		return new ResponseEntity<user_registration>(savedUser,HttpStatus.CREATED);
	}
	
	//Retrieve all user registrations 
	@GetMapping("/all")
	public Iterable<user_registration> getAllUsers() 
	{
		return userRegistrationDao.findAll();
	}
	
	
}

package com.issue_tracking.user.user_registration;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface userRegistrationDao extends CrudRepository<user_registration, Long> 
{

	Optional<user_registration> findByUserId(String userId);
	
}

package com.issue_tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IssueTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueTrackingApplication.class, args);
		System.out.println("Welcome to the Issue Tracking System.....");
	}

}

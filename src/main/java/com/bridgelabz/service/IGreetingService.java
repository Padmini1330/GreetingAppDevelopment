package com.bridgelabz.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.model.User;

@Service
public interface IGreetingService 
{
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
}
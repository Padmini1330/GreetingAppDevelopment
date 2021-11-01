package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.Greeting;


@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
	
}
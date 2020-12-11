package com.bootcamp.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dslearn.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}

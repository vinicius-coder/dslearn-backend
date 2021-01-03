package com.bootcamp.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootcamp.dslearn.entities.User;
import com.bootcamp.dslearn.repositories.UserRepository;
import com.bootcamp.dslearn.services.exceptions.ForbiddenExcption;
import com.bootcamp.dslearn.services.exceptions.UnauthorizedExcption;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;

	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		} catch (Exception e) {
			throw new UnauthorizedExcption("Invalid");
		}
	}

	public void validadeSelfOrAdmin(Long userId) {
		User user = authenticated();

		if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {
			throw new ForbiddenExcption("Access denied!");
		}
	}

}

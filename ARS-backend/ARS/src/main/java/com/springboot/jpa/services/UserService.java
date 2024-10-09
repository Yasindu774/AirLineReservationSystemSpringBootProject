package com.springboot.jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.domain.User;
import com.springboot.jpa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User login(User user) {
		User user1 = null;
		if (repository.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return repository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		} else {
			return user1;

		}
	}

}

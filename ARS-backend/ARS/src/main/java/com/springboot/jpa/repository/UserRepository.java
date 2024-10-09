package com.springboot.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	abstract public User findByUsernameAndPassword(String username, String password);
	
	abstract public User findByUsername(String username);
	
	abstract public User findByPassword(String password);

}

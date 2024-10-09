package com.springboot.jpa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.jpa.domain.User;
import com.springboot.jpa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class ARS implements CommandLineRunner  {
    public static void main(String[] args) {
    SpringApplication.run(ARS.class,args);
    }
    
    @Autowired
	private UserRepository userRepository;
    
    @Override
	public void run(String... args) throws Exception {
		User user =new User(0,"admin","admin@hcl.com","Admin123");
		
		userRepository.save(user);
		
	}
    
    
}

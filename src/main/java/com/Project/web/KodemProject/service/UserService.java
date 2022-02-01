package com.Project.web.KodemProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.web.KodemProject.model.User;
import com.Project.web.KodemProject.repository.UserRepository;

@Service
public class UserService {
	@Autowired
 private UserRepository repo;

	public UserService() {}
	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	public User saveMyUser(User user)
	{
		return repo.save( user);
	}
	public User fetchUserByEmailId(String email)
	{
		
		return repo.findByEmail(email);
		
	}
	public User fetchUserByEmailAndPassword(String email,String password)
	{
		return repo.findByEmailAndPassword(email, password);
	}
	
	
	
 
}

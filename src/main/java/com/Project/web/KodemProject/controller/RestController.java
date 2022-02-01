package com.Project.web.KodemProject.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Project.web.KodemProject.model.User;
import com.Project.web.KodemProject.service.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private UserService service;
	@PostMapping("/register-user" )
	@Transactional
public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmail();
		if(tempEmailId!=null && !"".equals(tempEmailId))
			{
		User userObj=	service.fetchUserByEmailId(tempEmailId);
		if(userObj!=null) {
			throw new Exception("user with "+tempEmailId+"  already exists");
			}
		else
			System.out.println("user added to db");
			}
		User userObj=null;
	userObj=service.saveMyUser(user);
	return userObj;
	
}

   @PostMapping("/login")
   public User loginUser(@RequestBody User user) throws Exception
   {
	   String tempEmail=user.getEmail();
	   String tempPassword=user.getPassword();
	   User userObj=null;
	   if(tempEmail !=null && tempPassword!=null)
	   {
		  userObj=service.fetchUserByEmailAndPassword(tempEmail,tempPassword);
	   }
	   if(userObj==null)
		   throw new Exception("Invalid Credentials");
	   
	   return userObj;
	   
   }
}

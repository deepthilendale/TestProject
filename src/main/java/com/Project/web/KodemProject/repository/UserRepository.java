package com.Project.web.KodemProject.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Project.web.KodemProject.model.User;
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

	public User findByEmail(String email);
	public User findByEmailAndPassword(String email,String password);

	//void save(UserRepository user);
 
}

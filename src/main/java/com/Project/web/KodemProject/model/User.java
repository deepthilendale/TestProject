package com.Project.web.KodemProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int userId;
	  @Column(name="first_name")
	  private String firstName;
	  @Column(name="last_name")
	  private String lastName;
	  private String password;
	  private String email;
	  private String gender;
	  @Column(name="phone_number")
	  private long phoneNumber;
	  public User() {}
	  public User(int userId, String firstName, String lastName, String password, String email, String gender,
			int phoneNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	
  public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

  
  
  
}

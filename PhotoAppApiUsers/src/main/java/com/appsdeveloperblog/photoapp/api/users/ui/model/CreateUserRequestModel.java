package com.appsdeveloperblog.photoapp.api.users.ui.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateUserRequestModel {
	
	@NotNull(message="firstname cannot be null")
	@Size(min=2, message="first name cannot be < 2")
	private String firstName;
	
	@NotNull(message="last name cannot be null")
	@Size(min=2, message="last name cannot be < 2")
	private String lastName;
	
	@NotNull(message="pass name cannot be null")
	@Size(min=2, max=8, message="pass reqd")
	private String password;
	
	@NotNull(message="email cannot be null")
	@Email
	private String email;
	
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
	
	
	
}

package com.example.restwithspringboot.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "UserDetails")
public class UserDetails {

	@Id
	public String id;
	
	@Field(value = "firstName")
	@NotNull(message = "FirstName is Empty")
	public String firstName;
	
	@Field(value = "lastName")
	@NotNull(message = "LastName is Empty")
	public String lastName;
	
	@Field(value = "email")
	@NotNull(message = "email is Empty")
	@Email(message = "email is not valid")
	public String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

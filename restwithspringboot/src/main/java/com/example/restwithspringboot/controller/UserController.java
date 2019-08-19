package com.example.restwithspringboot.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restwithspringboot.model.UserDetails;
import com.example.restwithspringboot.service.UserService;

@RestController
@RequestMapping("users")
public class UserController
{
	@Autowired
	private UserService userService;
	
	//CREATE USER
	@PostMapping("/createUser")
	public String storeUser(@Valid @RequestBody UserDetails userDetails)
	{
		userService.storeUser(userDetails);
		return "User added successfully";
	}
	
	//READ SPECIFIC USER
	@GetMapping("/readUser/{id}")
	public Optional<UserDetails> retriveUser(@PathVariable String id)
	{
		return userService.getUser(id);		
	}	
	
	//READ ALL USERS
	@GetMapping("/readAllUsers")
	public List<UserDetails> retriveUsers()
	{
		return userService.getAllUsers();
	}
	
	//UPDATE SPCIFIC USER
	@PutMapping("/updateUser")
	public String updateUser(@Valid @RequestBody UserDetails userDetails)
	{
		userService.updateUser(userDetails);
		return "User updated successfully";
	}
	
	//DELETE ALL USERS
	@DeleteMapping("/deleteAllUsers")
	public String deleteUsers()
	{
		userService.deleteAll();
		return "All Users deleted successfully...";
	}
	
	//DELETE SPECIFIC USER
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id, @RequestBody UserDetails userDetails)
	{	
		userService.deleteUser(id);
		return "User deleted successfully";
	}
}
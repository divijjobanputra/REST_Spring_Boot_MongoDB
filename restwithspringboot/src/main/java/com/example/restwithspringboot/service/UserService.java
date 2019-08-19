package com.example.restwithspringboot.service;

import java.util.List;
import java.util.Optional;

import com.example.restwithspringboot.model.UserDetails;

public interface UserService {
	UserDetails storeUser(UserDetails userDetails);
	
	UserDetails updateUser(UserDetails userDetails);
	
	List<UserDetails> getAllUsers();
	
	void deleteAll();
	
	void deleteUser(String id);
	
	Optional<UserDetails> getUser(String id);
}

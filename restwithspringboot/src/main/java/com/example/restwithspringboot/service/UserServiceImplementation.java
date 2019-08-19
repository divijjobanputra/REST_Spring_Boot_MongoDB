package com.example.restwithspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restwithspringboot.model.UserDetails;
import com.example.restwithspringboot.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails storeUser(UserDetails userDetails) {
		// TODO Auto-generated method stub
		return repository.save(userDetails);
	}

	@Override
	public UserDetails updateUser(UserDetails userDetails) {
		// TODO Auto-generated method stub
		return repository.save(userDetails);
	}

	@Override
	public List<UserDetails> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<UserDetails> getUser(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}

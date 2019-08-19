package com.example.restwithspringboot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.restwithspringboot.model.UserDetails;

@Repository
public interface UserRepository extends MongoRepository<UserDetails, String>
{

}

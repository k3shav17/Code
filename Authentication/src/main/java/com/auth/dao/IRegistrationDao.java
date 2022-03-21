package com.auth.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.auth.entity.UserLogin;
import com.auth.entity.UserRegister;

public interface IRegistrationDao extends MongoRepository<UserRegister, Integer> {

	@Query("{'name':?0}")
	Optional<UserLogin> findByName(String name);

}

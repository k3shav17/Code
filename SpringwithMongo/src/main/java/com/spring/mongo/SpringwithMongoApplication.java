package com.spring.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.spring.mongo.repository.ItemRepository;

@SpringBootApplication
@EnableMongoRepositories
public class SpringwithMongoApplication {

	@Autowired
	ItemRepository groceryItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringwithMongoApplication.class, args);
	}

}
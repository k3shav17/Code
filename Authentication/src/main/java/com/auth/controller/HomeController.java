package com.auth.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth.dao.IRegistrationDao;
import com.auth.entity.UserLogin;
import com.auth.entity.UserRegister;

@RestController
public class HomeController {

	@Autowired
	private IRegistrationDao registrationDao;
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello Spring";
	}

	@PostMapping("/register")
	public ResponseEntity<String> newUser(@RequestBody UserRegister userRegister) {

		registrationDao.save(userRegister);
		return new ResponseEntity<>(
				"Thanks for registering with us " + userRegister.getName(),
				new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/getallusers")
	public List<UserRegister> allRegisteredUsers() {
		return registrationDao.findAll();
	}

	@PostMapping("/login")
	public String loginOperation(@RequestBody UserLogin login) {

		Optional<UserLogin> userLogin = registrationDao.findByName(login.getName());

		if (userLogin.isPresent()) {

			if ((login.getPassword().equals(userLogin.get().getPassword()))) {

				return "Hi! " + login.getName() + ", Explore the site now.";
			}
		}
		return "Invalid Details";

	}

}

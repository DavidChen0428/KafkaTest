package com.project.david.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.david.entity.User;
import com.project.david.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserServiceImpl userServiceImpl;

	public UserController(UserServiceImpl userServiceImpl) {
		super();
		this.userServiceImpl = userServiceImpl;
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User savedUser=userServiceImpl.ceateUser(user);
		return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
	}
}

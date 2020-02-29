package com.demo.hotel.management.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hotel.management.user.entity.User;
import com.demo.hotel.management.user.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<User> getUsers() {
		return this.userService.getUsers();
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return this.userService.createUser(user);
	}
	
	@GetMapping("{id}")
	public User getUserById(@PathVariable long id) {
		return this.userService.getUserById(id);
	}
}

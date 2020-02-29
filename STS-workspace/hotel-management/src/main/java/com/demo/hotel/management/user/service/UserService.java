package com.demo.hotel.management.user.service;

import java.util.List;

import com.demo.hotel.management.user.entity.User;

public interface UserService {
	List<User> getUsers();
	User createUser(User user);
	User getUserById(long id);
	boolean authenticateByUsername(String username);
}

package com.demo.hotel.management.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hotel.management.user.entity.User;
import com.demo.hotel.management.user.repository.UserRepository;
import com.demo.hotel.management.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	@Override
	public List<User> getUsers() {
		return this.userRepo.findAll();
	}

	@Override
	public User createUser(User user) {
		return this.userRepo.save(user);
	}

	@Override
	public User getUserById(long id) {
		return this.userRepo.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
	}
	@Override
	public boolean authenticateByUsername(String username) {
		Optional<User> userOpt = this.userRepo.findByUsername(username);
		return userOpt.isPresent();
	}

}

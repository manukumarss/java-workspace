package com.example.unicode.service;

import com.example.unicode.model.User;

public interface UserService {
	String generateUniCode(User user);
	boolean checkForValidAge(User user);
}

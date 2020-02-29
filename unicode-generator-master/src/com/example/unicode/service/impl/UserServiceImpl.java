package com.example.unicode.service.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.example.unicode.model.Gender;
import com.example.unicode.model.User;
import com.example.unicode.service.UserService;
import com.example.unicode.utils.AppConstants;

public class UserServiceImpl implements UserService{

	@Override
	public String generateUniCode(User user) {
		return (user.getSurname().substring(0, AppConstants.CHAR_LIMIT_SURNAME)
				+ user.getFirstname().substring(0, AppConstants.CHAR_LIMIT_FIRSTNAME)
				+ this.last2DigitsOfYear(user)
				+ user.getDob().getMonth().toString().charAt(0)
				+ this.getDayOfDob(user)
				+ user.getTownOfBirth().getTownCode()).toUpperCase();
	}
	
	@Override
	public boolean checkForValidAge(User user) {
		return ChronoUnit.YEARS.between(user.getDob(), LocalDate.now()) >= AppConstants.USER_MIN_AGE &&
				ChronoUnit.YEARS.between(user.getDob(), LocalDate.now()) <= AppConstants.USER_MAX_AGE;
	}
	
	
	private int last2DigitsOfYear(User user) {
		return user.getDob().getYear() % 100;
	}
	
	private int getDayOfDob(User user) {
		int day = user.getDob().getDayOfMonth();
		if(user.getGender() == Gender.FEMALE)
			day += AppConstants.ADD_ON_DAYS_IF_FEMALE;
		
		return day;
	}

}

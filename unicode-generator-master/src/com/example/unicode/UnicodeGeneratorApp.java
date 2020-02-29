package com.example.unicode;

import java.time.LocalDate;
import java.time.Month;

import com.example.unicode.model.Gender;
import com.example.unicode.model.User;
import com.example.unicode.service.UserService;
import com.example.unicode.service.impl.UserServiceImpl;
import com.example.unicode.model.TownOfBirth;

public class UnicodeGeneratorApp {

	public static void main(String[] args) {
		/*
		 * User male = new User("revart", "John", Gender.MALE, LocalDate.of(1991,
		 * Month.DECEMBER, 10), TownOfBirth.CHAMARAJANAGAR);
		 */
		
		User female = new User("green", "eva", 
				Gender.FEMALE, LocalDate.of(1991, Month.DECEMBER, 10), TownOfBirth.BANGLORE);
		
		UserService userService = new UserServiceImpl();
		
		if(userService.checkForValidAge(female)) {
			System.out.println(userService.generateUniCode(female));
		}else {
			System.out.println("person's age is not eligible for unicode generation");
		}
	}
}

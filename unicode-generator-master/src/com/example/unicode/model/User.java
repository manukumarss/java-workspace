package com.example.unicode.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class User {
	private String surname;
	private String firstname;
	private Gender gender;
	private LocalDate dob;
	private TownOfBirth townOfBirth;
	
	public User(String surname, String firstname, 
			Gender gender, LocalDate dob, 
			TownOfBirth townOfBirth) {
		super();
		this.surname = surname;
		this.firstname = firstname;
		this.gender = gender;
		this.dob = dob;
		this.townOfBirth = townOfBirth;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public TownOfBirth getTownOfBirth() {
		return townOfBirth;
	}

	public void setTownOfBirth(TownOfBirth townOfBirth) {
		this.townOfBirth = townOfBirth;
	}
}

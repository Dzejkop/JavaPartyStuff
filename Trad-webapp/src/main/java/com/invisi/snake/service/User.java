package com.invisi.snake.service;

import lombok.Getter;
import lombok.Setter;

public class User {
	
	public User(int id, String firstName, String lastName) {
		this.setId(id);
		this.setName(firstName);
		this.setSurname(lastName);
	}
	
	public User() {
		setId(42);
		setName("John");
		setSurname("Doe");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private String name;
	private String surname;
}

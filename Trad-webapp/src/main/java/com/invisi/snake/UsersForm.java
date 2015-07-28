package com.invisi.snake;

import java.util.ArrayList;
import java.util.List;

public class UsersForm {
	
	public UsersForm() {
		users = new ArrayList<User>();
	}
	
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void createDoes(int i) {
		for(int n = 0; n < i; n++) {
			users.add(new User("John", "Doe"));
		}
	}
}

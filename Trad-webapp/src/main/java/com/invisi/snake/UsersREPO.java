package com.invisi.snake;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UsersREPO {

	private List<User> usersList;
	
	public UsersREPO() {
		setUsersList(new ArrayList<User>());
	}

	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}
	
	public void addUser(User u) {
		usersList.add(u);
	}
	
	public User getUserByIndex(int i) {
		return usersList.get(i);
	}
	
}

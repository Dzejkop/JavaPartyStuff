package com.invisi.snake;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UsersREPO {

	private List<User> usersList;
	
	public UsersREPO() {
		usersList = new ArrayList<User>();
	}

	
}

package com.invisi.snake.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.invisi.snake.service.User;

import lombok.Getter;
import lombok.Setter;

@Repository
public class UsersREPO {
		
	@Autowired
	private DataSource dataSource;
	
	private Connection connection = null;
	
	private static final String ALL_USERS_QUERY = "SELECT * FROM users;";
	private static final String SELECT_USER_QUERY = "SELECT * FROM users WHERE Name=? AND Surname=?;";
	private static final String SELECT_USER_BY_ID = "SELECT * FROM users WHERE ID = ?;";
	
	private static final String ADD_USER_STATEMENT = "INSERT INTO users(Name, Surname) VALUES (?, ?);";
	
	private static final String USER_NAME = "musicart_5";
	private static final String PASS = "dRa3weHu";
	
	
	public List<User> getUsersList() {
		try {
			List<User> userList = new ArrayList<User>();
			
			//connection = dataSource.getConnection(USER_NAME, PASS);
			connection = dataSource.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement(ALL_USERS_QUERY);
			
			User user = null;
			
			ResultSet results = preparedStatement.executeQuery();
			
			while(results.next()) {
				userList.add(
						new User(
								results.getInt("ID"),
								results.getString("Name"),
								results.getString("Surname")
								));
			}
			
			results.close();
			preparedStatement.close();
			
			return userList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	
	public void addUser(User u) {
		try {			
			//connection = dataSource.getConnection(USER_NAME, PASS);
			connection = dataSource.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_USER_STATEMENT);

			preparedStatement.setString(1, u.getName());
			preparedStatement.setString(2, u.getSurname());
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public User getUserById(int id) {
		try {
			//connection = dataSource.getConnection(USER_NAME, PASS);
			connection = dataSource.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
			
			preparedStatement.setInt(1, id);
			
			User user = null;
			
			ResultSet results = preparedStatement.executeQuery();
			
			if(results.next()) {
				user = new User(
						results.getInt("ID"),
						results.getString("Name"),
						results.getString("Surname")
						);
			}
			
			results.close();
			preparedStatement.close();
			
			return user;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	
}

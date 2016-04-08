package com.app.dao;

import java.util.List;

import com.app.model.User;

public interface UserDAO {

	void saveUser(User user);

	List<User> findAllUsers();

	void deleteUser(Integer colname);

	void updateUser(User user);
	User findByFirstname(String firstname);
}
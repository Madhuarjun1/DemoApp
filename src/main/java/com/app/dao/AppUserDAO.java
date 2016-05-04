package com.app.dao;

import java.util.List;

import com.app.model.AddUser;

public interface AppUserDAO {

	void saveUser(AddUser user);

	List<AddUser> findAllUsers();

	void deleteUser(Integer colname);

	void updateUser(AddUser user);
	AddUser findByFirstname(String firstname);
}
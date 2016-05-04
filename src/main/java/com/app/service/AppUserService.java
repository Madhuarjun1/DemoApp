package com.app.service;

import java.util.List;

import com.app.model.AddUser;

public interface AppUserService {

	void saveUser(AddUser user);

	List<AddUser> findAllUsers();

	void deleteUser(Integer colname);

	void updateUser(AddUser user);
	AddUser findByFirstname(String firstname);
}
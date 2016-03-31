package com.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDAO;
import com.app.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	public void saveUser(User user) {
		dao.saveUser(user);
	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	public void deleteUser(String id) {
		dao.deleteUser(id);
	}

	/*
	 * public User findBySsn(String ssn) { return dao.findBySsn(ssn); }
	 * 
	 * public void updateEmployee(User user){ dao.updateEmployee(user); }
	 */
}
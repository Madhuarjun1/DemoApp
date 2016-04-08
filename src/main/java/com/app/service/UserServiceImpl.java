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
		System.out.println("Entered into service of saveUser method");
		dao.saveUser(user);
	}

	public List<User> findAllUsers() {
		System.out.println("findAllUsers() method in UserServiceImpl class");
		return dao.findAllUsers();
	}

	public void deleteUser(Integer id) {
		dao.deleteUser(id);
	}

	
	 public User findByFirstname(String firstname) {
		 return dao.findByFirstname(firstname); }
	  
	  public void updateUser(User user){ dao.updateUser(user); }
	 
}

package com.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AppUserDAO;
import com.app.model.AddUser;

@Service("appUserService")
@Transactional
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	private AppUserDAO dao;

	public void saveUser(AddUser user) {
		System.out.println("Entered into service of saveUser method");
		dao.saveUser(user);
	}

	public List<AddUser> findAllUsers() {
		System.out.println("findAllUsers() method in UserServiceImpl class");
		return dao.findAllUsers();
	}

	public void deleteUser(Integer id) {
		dao.deleteUser(id);
	}

	
	 public AddUser findByFirstname(String firstname) {
		 return dao.findByFirstname(firstname); }
	  
	  public void updateUser(AddUser user){ dao.updateUser(user); }
	 
}

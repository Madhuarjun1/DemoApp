package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.User;
import com.app.service.UserService;
import com.app.service.UserServiceImpl;

@Controller
public class IndexController {
	
	@Autowired
	UserService us;
	 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("New Controller: Passing through...");
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value = "/saveUser" , method = RequestMethod.POST,consumes="application/json", produces = "application/json")

	public @ResponseBody String update(@RequestBody String name) {
		System.out.println("Entered into update method"+name);
	    String newname="{\"name\": \"Arjun\"}";
	    return newname;
	}
	
	@RequestMapping(value = "/viewUsers" , method = RequestMethod.GET,produces = "application/json")

	public @ResponseBody List<User> viewAll(@RequestBody String name) {
		System.out.println("Entered into view method"+name);
	   
		/*List<User> userList = us.findAllUsers();
		System.out.println(userList.size());
        for (User user : userList) {
        	System.out.println("for each loop executing");
            System.out.println(user.getFirstname()+""+user.getLastname()+""+user.getEmail()+""+user.getPhone()+""+user.getGender()+""+user.getCountry()+""+user.getId());
        }*/
		
	    return us.findAllUsers();
	}

	/*public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}*/
}

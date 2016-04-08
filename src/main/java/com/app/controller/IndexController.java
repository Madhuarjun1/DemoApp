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

	public @ResponseBody String saveUser(@RequestBody final User user) {
		System.out.println("Entered into saveUser method");
		System.out.println(user.getFirstname()+user.getLastname()+user.getCountry()+user.getEmail()+user.getPhone()+user.getGender());
		if(user.getFirstname()!=null){
			User checkUser=us.findByFirstname(user.getFirstname());
			
			if(checkUser==null){
				us.saveUser(user);
			}else if(checkUser.getFirstname()!=null){
				user.setId(checkUser.getId());
				System.out.println("update method executing "+user.getId()+""+user.getFirstname());
				us.updateUser(user);
			}
			
		}else{
			System.out.println("something wrong");
		}
		
		
		String result="{\"name\": \"Arjun\"}";
	    return result;
	}
	
	@RequestMapping(value = "/viewUsers" , method = RequestMethod.GET,produces = "application/json")

	public @ResponseBody List<User> viewAll(@RequestBody String name) {
		System.out.println("Entered into view method"+name);
	   
	    return us.findAllUsers();
	}
	
	@RequestMapping(value = "/removeUser" , method = RequestMethod.POST,consumes="application/json", produces = "application/json")

	public @ResponseBody List<User> removeUser(@RequestBody final User user) {
		System.out.println("Entered into removeUser method");
		System.out.println(user.getFirstname()+user.getLastname()+user.getCountry()+user.getEmail()+user.getPhone()+user.getGender());
		us.deleteUser(user.getId());
		
	    return us.findAllUsers();
	}
	
	
	@RequestMapping(value = "/updateUser" , method = RequestMethod.POST,consumes="application/json", produces = "application/json")

	public @ResponseBody String updateUser(@RequestBody final User user) {
		System.out.println("Entered into updateUser method");
		System.out.println(user.getFirstname()+user.getLastname()+user.getCountry()+user.getEmail()+user.getPhone()+user.getGender());
		us.updateUser(user);
		String result="{\"name\": \"Arjun\"}";
	    return result;
	}
	
	
	
	/*public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}*/
}

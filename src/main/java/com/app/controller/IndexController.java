package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.app.model.AddUser;
import com.app.service.AppUserService;

@Controller
public class IndexController {
	
	@Autowired
	AppUserService us;
	 
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("New Controller: Passing through...");
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}
	@RequestMapping(value = "/saveUser" , method = RequestMethod.POST,consumes="application/json", produces = "application/json")

	public @ResponseBody String saveUser(@RequestBody final AddUser user) {
		System.out.println("Entered into saveUser method");
		System.out.println(user.getFirstname()+user.getLastname()+user.getCountry()+user.getEmail()+user.getPhone()+user.getGender());
		if(user.getFirstname()!=null){
			AddUser checkUser=us.findByFirstname(user.getFirstname());
			
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

	public @ResponseBody List<AddUser> viewAll(@RequestBody String name) {
		System.out.println("Entered into view method"+name);
	   
	    return us.findAllUsers();
	}
	
	@RequestMapping(value = "/removeUser" , method = RequestMethod.POST,consumes="application/json", produces = "application/json")

	public @ResponseBody List<AddUser> removeUser(@RequestBody final AddUser user) {
		System.out.println("Entered into removeUser method");
		System.out.println(user.getFirstname()+user.getLastname()+user.getCountry()+user.getEmail()+user.getPhone()+user.getGender());
		us.deleteUser(user.getId());
		
	    return us.findAllUsers();
	}
	
	
	@RequestMapping(value = "/updateUser" , method = RequestMethod.POST,consumes="application/json", produces = "application/json")

	public @ResponseBody String updateUser(@RequestBody final AddUser user) {
		System.out.println("Entered into updateUser method");
		System.out.println(user.getFirstname()+user.getLastname()+user.getCountry()+user.getEmail()+user.getPhone()+user.getGender());
		us.updateUser(user);
		String result="{\"name\": \"Arjun\"}";
	    return result;
	}
	
	
	
	public AppUserService getUs() {
		return us;
	}

	public void setUs(AppUserService us) {
		this.us = us;
	}
}

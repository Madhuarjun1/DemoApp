package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("New Controller: Passing through...");
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)

	public @ResponseBody String update(@RequestBody String name) {
		System.out.println("Entered into update method"+name);
	    String newname="{\"name\": \"Arjun\"}";
	    return newname;
	}
}

package com.invisi.snake.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.invisi.snake.repository.UsersREPO;
import com.invisi.snake.service.User;


@Controller
public class TrdController {
	
	@Autowired
	private UsersREPO usersRepo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView mainPage() {
				
		return new ModelAndView("main");
	}
	
	@RequestMapping(value="/addUsers", method=RequestMethod.POST)
	public ModelAndView start(@RequestParam("userNumber") Integer userNumber) {

		System.out.println("In input get from main, val: " + userNumber.intValue());
		
		UsersForm usersForm = new UsersForm();
		usersForm.createDoes(userNumber.intValue());
		
		return new ModelAndView("defineUsers", "usersForm", usersForm);
	}
	
	@RequestMapping(value="/checkUser", method=RequestMethod.POST)
	public ModelAndView getUserDetails(@RequestParam("userIndex") Integer userIndex) {
		
		User user = usersRepo.getUserById(userIndex.intValue());
		
		System.out.println("User is: " + user);
		
		return new ModelAndView("userDetails", "user", user);
	}
	
	@RequestMapping(value="/allUsers", method=RequestMethod.GET)
	public ModelAndView showAllUsers() {
		return new ModelAndView("allUsers", "users", usersRepo.getUsersList());
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView userFormSubmit(@ModelAttribute("usersForm") UsersForm form) {
		
		List<User> users = form.getUsers();
		
		for(User u : users) {	
			System.out.println("User: " + u.getName() + " " + u.getSurname());
			usersRepo.addUser(u);
		}
						
		return new ModelAndView("redirect:/");
	}
}

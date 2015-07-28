package com.invisi.snake;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrdController {
	
	@Autowired
	private UsersREPO usersRepo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView mainPage() {
		return new ModelAndView("main", "userCount", new Integer(usersRepo.getUsersList().size()));
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
		return new ModelAndView("userDetails", "user", usersRepo.getUsersList().get(userIndex.intValue()));
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView userFormSubmit(@ModelAttribute("usersForm") UsersForm form) {
		
		List<User> users = form.getUsers();
		
		for(User u : users) {
			System.out.println("Adding user...");
			System.out.println("User name: " + u.getFirstName());
			System.out.println("User last name: " + u.getLastName());
			System.out.println("");
			
			usersRepo.addUser(u);
		}
				
		return new ModelAndView("redirect:/");
	}
}

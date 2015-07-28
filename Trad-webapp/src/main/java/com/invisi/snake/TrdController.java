package com.invisi.snake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrdController {
	
	@Autowired
	private UsersREPO usersRepo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mainPage() {
		return "main";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String mainPageSubmit(@RequestParam("userNumber") Integer userNumber, Model model) {
		
		model.addAttribute("userNumber", userNumber);
		
		return "main";
	}


}

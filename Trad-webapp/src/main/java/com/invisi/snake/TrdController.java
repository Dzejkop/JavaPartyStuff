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
	
	@RequestMapping("/")
	public String mainPage() {
		return "main";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "main";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String mainPageSubmit() {
		return "inputUsers";
	}

}

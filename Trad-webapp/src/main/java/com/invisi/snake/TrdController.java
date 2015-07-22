package com.invisi.snake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrdController {
	
	@Autowired
	private TrdDAO trdDao;
	
	@RequestMapping("/example")
	public String example(Model model) {
		model.addAttribute("message", "lol");
		return "main";
	}
	
	@RequestMapping("/kat/{imie}")
	public String kotTest(@PathVariable("imie") String name, Model model) {
		model.addAttribute("imieKota", name);
		return "kot";
	}
	
	public String showCats(Model model) {
		return "";
	}
	
	public String catDetails(String catName, Model model) {
		return "";
	}
	
	@RequestMapping("/kot/{imie}/{wiek}/{zlo}")
	public String addCat(
			@PathVariable("imie") String name, 
			@PathVariable("wiek") String age, 
			@PathVariable("zlo") String evil,
			Model model) {
		
		if(trdDao != null) {
			
			trdDao.add(new Kot(name, age, evil));
			
			return "AddCatSuccess";
		}
		else {
			return "AddCatFailure";
		}
		
	}
}

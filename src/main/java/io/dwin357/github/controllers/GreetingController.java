package io.dwin357.github.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	public GreetingController() {
		super();
	}
	
	@RequestMapping(value="/greet")
	public String greetPerson (Model model) {
		
		model.addAttribute("salutation", "whut up dawg");
		
		// this is the string of the view to be used
		return "hi";
	}
	
	@RequestMapping(value="/sayHi")
	public String whatever(Model model) {
		
		model.addAttribute("words", "hey hey");
		
		// can include nested path
		return "greetings/hello";
	}

}

package io.dwin357.github.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.dwin357.github.models.RubberDuck;

@Controller
public class InputController {

	public InputController() {
		super();
	}
	
	@RequestMapping(value="/sendIt", method=RequestMethod.GET)
	public String boop(@ModelAttribute("daffy") RubberDuck duck) {
		

		return "input/boop";
	}
	
	@RequestMapping(value="/sendIt", method=RequestMethod.POST)
	public String bop(@ModelAttribute("daffy") RubberDuck duck) {

		return "input/duckShow";
	}

}

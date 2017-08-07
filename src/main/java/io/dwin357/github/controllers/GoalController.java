package io.dwin357.github.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import io.dwin357.github.models.Goal;
import io.dwin357.github.services.GoalService;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@Autowired
	private GoalService goalService;

	public GoalController() {
		super();
	}

	// thsi is looking more familiar :: this is my form route returning an empty object
	@RequestMapping(value="/setGoal", method=RequestMethod.GET)
	public String requestLifeGoalForm(Model model) {
		model.addAttribute("goal", new Goal());
		return "input/addGoal";
	}
	
	// this is doing a number of things (on post)
	// // it is creating a goal and populating it based on the values in the form
	// // it is then also stashing that obj in the session under the key "goal" :: not super happy, would like to do that myself
	// // finally, it sends a 302 response to the user to execute a get to sayHi.html (which reads from the goal in session)
	@RequestMapping(value="/setGoal", method=RequestMethod.POST)
	public String registerLifeGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {
		
		// if form-populated-model has errors, render form page
		// populated model will then re-populate form fields
		if(result.hasErrors()) {
			return "input/addGoal";
		} else {
			goalService.save(goal);
		}
		
		// note this does not use a nested-view reference b/c it is sending a new request 
		// with "sayHi.html" as the url
		return "redirect:sayHi.html";
	}
}

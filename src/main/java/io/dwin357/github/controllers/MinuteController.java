package io.dwin357.github.controllers;

import java.util.concurrent.ExecutorCompletionService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.dwin357.github.models.Exercise;
import io.dwin357.github.models.Goal;
import io.dwin357.github.services.ExerciseService;

@Controller
public class MinuteController {

	@Autowired
	private ExerciseService exerciseService;
	
	public MinuteController() {
		super();
	}

	@RequestMapping(value="/addMinutes", method=RequestMethod.GET)
	public String getMinutesForm(@ModelAttribute("exercise") Exercise exercise) {
		
		return "addMinuteForm";
	}
	
	@RequestMapping(value="/addMinutes", method=RequestMethod.POST)
	public String postMinutes(@Valid @ModelAttribute("exercise") Exercise exercise, HttpSession session, BindingResult result) {
		if (result.hasErrors()) {
			return "addMinuteForm";
		} else {
			Goal goal = (Goal) session.getAttribute("goal");
			exercise.setGoal(goal);
			exerciseService.save(exercise);
		}
		
		return "addMinutes";
	
	}
}

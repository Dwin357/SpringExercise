package io.dwin357.github.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.dwin357.github.models.Goal;
import io.dwin357.github.repositories.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	public GoalServiceImpl() {
		super();
	}

	@Transactional
	@Override
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

}

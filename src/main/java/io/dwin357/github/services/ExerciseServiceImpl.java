package io.dwin357.github.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.dwin357.github.models.Exercise;
import io.dwin357.github.repositories.ExerciseRepository;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	ExerciseRepository exerciseRepository;
	
	public ExerciseServiceImpl() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see io.dwin357.github.services.ExerciseService#save(io.dwin357.github.models.Exercise)
	 */
	@Override
	@Transactional
	public Exercise save(Exercise exercise) {
		return exerciseRepository.save(exercise);
	}

	public ExerciseRepository getExerciseRepository() {
		return exerciseRepository;
	}

	public void setExerciseRepository(ExerciseRepository exerciseRepository) {
		this.exerciseRepository = exerciseRepository;
	}

}

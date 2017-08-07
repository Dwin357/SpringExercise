package io.dwin357.github.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.dwin357.github.models.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;
	
	public ExerciseRepositoryImpl() {
		super();
	}

	@Override
	public Exercise save(Exercise exercise) {
		em.persist(exercise);
		em.flush();
		return exercise;
	}

}

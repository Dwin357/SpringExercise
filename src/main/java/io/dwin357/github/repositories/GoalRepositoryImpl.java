package io.dwin357.github.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.dwin357.github.models.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager em;
	
	public GoalRepositoryImpl() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see io.dwin357.github.repositories.GoalRepository#save(io.dwin357.github.models.Goal)
	 */
	@Override
	public Goal save(Goal goal) {
		
		em.persist(goal);
		em.flush();
		
		return goal;
	}

}

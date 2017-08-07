package io.dwin357.github.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Exercise {

	@NotNull
	@Column(name="ACTION")
	private String activity;
	
	@Range(min=1, max=120)
	private int minutes;
	
	@NotNull
	@ManyToOne
	private Goal goal;
	
	@Id
	@GeneratedValue
	private long id;
	
	public Exercise() {
		super();
	}

	
	public String getActivity() {
		return activity;
	}


	public Goal getGoal() {
		return goal;
	}


	public long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	

}

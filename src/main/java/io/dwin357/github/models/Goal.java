package io.dwin357.github.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="goals")
public class Goal {
	
	@Id
	@GeneratedValue
	private Long id;

	@NotBlank
	private String lifeGoal;
	
	@Range(min=0, max=120)
	private int age;
	
	@OneToMany(mappedBy="goal", cascade=CascadeType.ALL)
	private List<Exercise> exercises = new ArrayList<Exercise>();
	
	public Goal() {
		super();
	}

	public int getAge() {
		return age;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public Long getId() {
		return id;
	}

	public String getLifeGoal() {
		return lifeGoal;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLifeGoal(String lifeGoal) {
		this.lifeGoal = lifeGoal;
	}

}

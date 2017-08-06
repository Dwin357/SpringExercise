package io.dwin357.github.models;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class Goal {

	@NotBlank
	private String lifeGoal;
	
	@Range(min=0, max=120)
	private int age;
	
	public Goal() {
		super();
	}

	public String getLifeGoal() {
		return lifeGoal;
	}

	public void setLifeGoal(String lifeGoal) {
		this.lifeGoal = lifeGoal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

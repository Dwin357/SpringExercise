package io.dwin357.github.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

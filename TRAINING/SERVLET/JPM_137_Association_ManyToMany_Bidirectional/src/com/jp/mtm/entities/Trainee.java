package com.jp.mtm.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TRAINEE_MTM1")
public class Trainee {
	
	
	@Id
	@Column(name="trainee_id")
	private Long traineeId;
	
	
	@Column(name="trainee_name")
	private String traineeName;
	
	
	// STEP 1 :
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="trainees")	
	private Set<Course> courses = new HashSet<>();
	
	

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainee(Long traineeId, String traineeName, Set<Course> courses) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.courses = courses;
	}

	public Long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", courses=" + courses + "]";
	}

	
}

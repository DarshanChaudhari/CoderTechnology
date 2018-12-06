package com.jp.mtm.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="COURSE_MTM1" )
public class Course {

	
	@Id
	@Column(name="Course_Id")	
	private Long courseId;
	
	
	
	@Column(name="Course_name")
	private String courseName;
	
	
	@ManyToMany (cascade=CascadeType.ALL)
	// STEP 2 : it will create third table and now steps will joinTable AND THEN JOIN COLUMNS
		@JoinTable(name="COURSE_TRAINEE_MAPPING_MTM",
	// STEP 3 :joinColumns	
		joinColumns={@JoinColumn(name="Course_Id")},
	// STEP 4 :InversejoinColumns
		inverseJoinColumns={@JoinColumn(name="trainee_id") 
		})
	private Set<Trainee> trainees = new HashSet<>();


	public Long getCourseId() {
		return courseId;
	}


	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Set<Trainee> getTrainees() {
		return trainees;
	}


	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}


	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName +  "]";
	}


		
	
}

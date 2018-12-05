package com.jp.mtm.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="COURSE_MTM" )
public class Course {

	
	@Id
	@Column(name="Course_Id")	
	private Long courseId;
	
	
	
	@Column(name="Course_name")
	private String courseName;
	
	
	// STEP 1 :
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="courses")
	
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
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", trainees=" + trainees + "]";
	}


		
	
}

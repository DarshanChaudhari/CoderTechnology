package com.jp.mtm.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.mtm.entities.Course;
import com.jp.mtm.entities.Trainee;
import com.jp.mtm.util.JPAUtil;

public class MTMClient {
	
	public static void main (String [] args) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		Trainee t1 = new Trainee();
		t1.setTraineeId(101L);
		t1.setTraineeName("OmPrakash");
		
		Trainee t2 = new Trainee();
		t2.setTraineeId(102L);
		t2.setTraineeName("Mahendra");
		
		Trainee t3 = new Trainee();
		t3.setTraineeId(103L);
		t3.setTraineeName("Chandrashekhar");
		
		
		Trainee t4 = new Trainee();
		t4.setTraineeId(104L);
		t4.setTraineeName("Rashmi");
		
		Trainee t5 = new Trainee();
		t5.setTraineeId(105L);
		t5.setTraineeName("Swati");
		
		Trainee t6 = new Trainee();
		t6.setTraineeId(106L);
		t6.setTraineeName("Sanjay");
		
		
		
		Course course1 = new Course();
		course1.setCourseId(200L);
		course1.setCourseName("Core Java");
		
		Course course2 = new Course();
		course2.setCourseId(201L);
		course2.setCourseName("SERVLET");
		
		

		
		Set<Trainee> traineesList1 = new HashSet<>();
		traineesList1.add(t1);
		traineesList1.add(t2);
		traineesList1.add(t3);
		traineesList1.add(t4);
		
		Set<Trainee> traineesList2 = new HashSet<>();
		traineesList2.add(t1);
		traineesList2.add(t2);
		traineesList2.add(t3);
		traineesList2.add(t4);
		traineesList2.add(t5);
		traineesList2.add(t6);
		
		
		
		//Set<Trainee> trainees = new HashSet<>();

		
//		trainees.add(t1);
//		trainees.add(t2);
//		trainees.add(t3);
//		
	
		
//		course2.setTrainees(trainees);
		
// Course 1 assign to trainners	
	/*	course1.getTrainees().add(t1);
		course1.getTrainees().add(t2);
		course1.getTrainees().add(t3);
		course1.getTrainees().add(t4);
		course1.getTrainees().add(t5);
		course1.getTrainees().add(t6);
		*/
// Course 2 assign to trainners [t2, t4, t6]		
	/*	course2.getTrainees().add(t2);
		course2.getTrainees().add(t4);
		course2.getTrainees().add(t6);*/
		
	/*	
		t1.getCourses().add(course1);
		t2.getCourses().add(course1);
		t3.getCourses().add(course1);
		t4.getCourses().add(course1);
		t5.getCourses().add(course1);
		t6.getCourses().add(course1);
		
		t2.getCourses().add(course2);
		
		
		Set<Course> courses = new HashSet<>();
		courses.add(course1);
		courses.add(course2);
		

		Set<Trainee> trainees = new HashSet<>();
		trainees.add(t1);
		*/
		
			
		
		// persisit course1 and course2
		entityManager.persist(course1);
		entityManager.persist(course2);
		
		// commit transactions
		entityManager.getTransaction().commit();
		
		// close em
		entityManager.close();		
				
	}

}
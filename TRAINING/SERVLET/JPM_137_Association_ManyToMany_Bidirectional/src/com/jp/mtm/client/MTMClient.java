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
		t6.setTraineeId(102L);
		t6.setTraineeName("Sanjay");
		
		
		Course course1 = new Course();
		course1.setCourseId(200L);
		course1.setCourseName("Core Java");
		

		
		Set<Trainee> trainees = new HashSet<>();
		trainees.add(t1);
		trainees.add(t2);
		trainees.add(t3);
		trainees.add(t4);
		trainees.add(t5);
		trainees.add(t6);
		
//		
//		Set<Trainee> trainees = new HashSet<>();
//		trainees.add(t1);
//		trainees.add(t2);
//		trainees.add(t3);
	
		
		course1.setTrainees(trainees);
		
		
		Course course2 = new Course();
		course1.setCourseId(201L);
		course1.setCourseName("SERVLET");
		
		course2.setTrainees(trainees);
		
		
		Set<Course> courses = new HashSet<>();
		courses.add(course1);
		courses.add(course2);
		
		t1.setCourses(courses);
		t2.setCourses(courses);
		t3.setCourses(courses);
		t4.setCourses(courses);
		t5.setCourses(courses);
		t6.setCourses(courses);
		
		
		entityManager.persist(course1);
		entityManager.persist(course2);
		
		// commit transactions
		entityManager.getTransaction().commit();
		
		// close em
		entityManager.close();		
				
	}

}

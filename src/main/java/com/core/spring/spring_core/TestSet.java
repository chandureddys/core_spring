package com.core.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setconfig.xml");
		Professor professor= (Professor) context.getBean("professor");
		 
		System.out.println("professor: " + professor.getName());
		System.out.println("Courses Name: " +professor.getCourses());

		
	}

}

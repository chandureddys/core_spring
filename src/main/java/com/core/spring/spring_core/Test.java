package com.core.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student= (Student) context.getBean("student");
		 
		System.out.println("Student ID: " + student.getId());
		System.out.println("Student Name: " + student.getName());
	}

}

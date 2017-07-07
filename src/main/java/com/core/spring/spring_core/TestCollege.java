package com.core.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("listconfig.xml");
		College college= (College) context.getBean("college");
		 
		System.out.println("collge: " + college.getName());
		System.out.println("Departments Name: " +college.getDepartments());
	}
		
	

}

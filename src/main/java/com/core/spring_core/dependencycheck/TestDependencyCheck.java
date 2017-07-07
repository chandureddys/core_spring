package com.core.spring_core.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.spring.spring_core.Student;

public class TestDependencyCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/core/spring_core/dependencycheck/config.xml");
		Patient patient= (Patient) context.getBean("patient");
		 
		System.out.println(patient);
	}

}

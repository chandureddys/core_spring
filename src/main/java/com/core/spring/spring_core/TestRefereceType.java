package com.core.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefereceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("referenceTypeconfig.xml");
		Pupil pupil= (Pupil) context.getBean("pupil");
		 
		System.out.println(pupil);
	}

}

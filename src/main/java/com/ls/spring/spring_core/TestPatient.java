package com.ls.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.spring.spring_core.Student;

public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("patientconfig.xml");
		Patient patient= (Patient) context.getBean("patient");
		 
		System.out.println(patient);
		
	}

}

package com.core.spring.spring_core.ls.javaanno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.spring.spring_core.Student;

public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("patientconfigjavaanno.xml");
		Patient patient= (Patient) context.getBean("patient"); 
		System.out.println(patient);
		context.registerShutdownHook();
		
	}

}

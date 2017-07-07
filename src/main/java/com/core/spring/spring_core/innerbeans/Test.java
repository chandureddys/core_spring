package com.core.spring.spring_core.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/core/spring/spring_core/innerbeans/config.xml");
		Student student= (Student) context.getBean("student");
		System.out.println(student.hashCode());
		Student student1= (Student) context.getBean("student");
		System.out.println(student1.hashCode());
	}

}

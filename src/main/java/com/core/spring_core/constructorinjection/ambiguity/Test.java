package com.core.spring_core.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/core/spring_core/constructorinjection/ambiguity/config.xml");
		Addition addition= (Addition) context.getBean("addition");
		System.out.println(addition);
		
	}

}

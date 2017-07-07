package com.core.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("propertyconfig.xml");
		CapitalAndState capitalAndState= (CapitalAndState) context.getBean("capitalAndState");
		 
		System.out.println(capitalAndState);
		
	}

}

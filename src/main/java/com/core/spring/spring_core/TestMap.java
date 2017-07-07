package com.core.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mapconfig.xml");
		Customer customer= (Customer) context.getBean("customer");
		 
		System.out.println("customer: " + customer.getId());
		System.out.println("customer products Name: " +customer.getProducts());

		
	}

}

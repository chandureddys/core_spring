package com.core.spring.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShoppingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("shoppingcartconfig.xml");
		Shoppingcart shoppingcart= (Shoppingcart) context.getBean("shoppingcart");
		 
		System.out.println(shoppingcart);
	}

}

package com.ls.spring.spring_core;


import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ls/spring/spring_core/daoconfig.xml");
		MyDAO myDAO= (MyDAO) context.getBean("myDAO");
		WSClient wsClient = (WSClient) context.getBean("wsClient");
		System.out.println(myDAO);
		System.out.println(wsClient);
	}

}

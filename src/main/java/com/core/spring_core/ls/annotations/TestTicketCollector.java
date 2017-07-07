package com.core.spring_core.ls.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTicketCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ticketcollectorconfig.xml");
		TicketCollector ticketCollector= (TicketCollector) context.getBean("ticketCollector"); 
		System.out.println(ticketCollector);
		context.registerShutdownHook();
		
	}

}

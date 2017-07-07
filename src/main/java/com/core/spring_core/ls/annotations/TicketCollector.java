package com.core.spring_core.ls.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketCollector {

	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@PostConstruct
	public void initialize(){
		
		System.out.println("inside initialize method");
		
	}
	
	@PreDestroy
	public void destroying(){
		System.out.println("inside destroy method");
	}
	
}

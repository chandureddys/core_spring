package com.core.spring_core.ls.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient{
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
    
	@PostConstruct
	public void hi(){
		System.out.print("hi hello inside init method");
	}
	
	@PreDestroy
	public void hello(){
		System.out.print("hi hello inside destroy method");
	}

	
}

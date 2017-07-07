package com.ls.spring.spring_core;

public class Patient {
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void hi(){
		System.out.print("hi hello inside init method");
	}
	public void hello(){
		System.out.print("hi hello inside destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}

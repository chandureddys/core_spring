package com.core.spring.spring_core;

import java.util.List;

public class Professor {
	
	private String name;
	
	private List<String> Courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return Courses;
	}

	public void setCourses(List<String> courses) {
		Courses = courses;
	}

}

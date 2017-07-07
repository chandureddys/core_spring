package com.core.spring_core.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Patient {

	private String name;
	private int id;
	private List<String> medicines;

	public String getName() {
		return name;
	}
    @Required
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
 
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + ", medicines=" + medicines + "]";
	}
	
	
}

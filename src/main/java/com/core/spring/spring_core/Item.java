package com.core.spring.spring_core;

public class Item {
	
	private String name;
	private int id;
	private String itemType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", id=" + id + ", itemType=" + itemType + "]";
	}
	
	

}

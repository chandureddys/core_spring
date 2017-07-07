package com.core.spring.spring_core;

public class Shoppingcart {
	
	private Item items;

	public Item getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Shoppingcart [items=" + items + "]";
	}

}

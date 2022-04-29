package com.tek.shoping;

public class ShoppingCart {

	
	private String name;
	private int num;
	
	private Items items;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	public Items getItems() {
		return items;
	}
	public void setItems(Items item) {
		this.items = item;
	}
	@Override
	public String toString() {
		return "ShoppingCart [name=" + name + ", num=" + num + ", item=" + items + "]";
	}
	
}

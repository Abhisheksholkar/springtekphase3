package com.tek.shoping;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/tek/shoping/config.xml");
		ShoppingCart shop = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(shop);
	}

}

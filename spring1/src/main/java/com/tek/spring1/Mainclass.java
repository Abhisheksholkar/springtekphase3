package com.tek.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/tek/spring1/config.xml");
		Sample1 sample1=(Sample1) context.getBean("sample1");
		System.out.println(sample1);
	}

}

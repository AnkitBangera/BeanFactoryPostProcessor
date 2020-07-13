package org.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

@SuppressWarnings("deprecation")
public class Shape {
//In this project spirng.xml place holder is been used for an example of bean factory Post processor
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle) context.getBean("triangle");
		System.out.println(triangle);
	}

}

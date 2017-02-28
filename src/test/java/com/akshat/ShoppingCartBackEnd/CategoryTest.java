package com.akshat.ShoppingCartBackEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AnnotationConfigurationException;

import com.akshat.ShoppingModem.Category;

public class CategoryTest {

	public static void main(String [] args)
	{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	
	context.scan("com.akshat");
	context.refresh();
	
	Category c = (Category) context.getBean("category");
	System.out.println("Program is running");
	
	
	
	}
}

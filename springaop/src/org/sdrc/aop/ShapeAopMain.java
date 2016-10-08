package org.sdrc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeAopMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfig.xml");
		ShapeService shapeService=applicationContext.getBean("shapeService", ShapeService.class);
		System.out.println(shapeService.getCircleDemo().getName());
	}
}

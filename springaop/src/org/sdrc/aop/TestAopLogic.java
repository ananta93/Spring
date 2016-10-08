package org.sdrc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopLogic {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfig.xml");
		CurrentLogic currentLogic=applicationContext.getBean("currentLogicProxy", CurrentLogic.class);
		currentLogic.printLogic();
	}
}

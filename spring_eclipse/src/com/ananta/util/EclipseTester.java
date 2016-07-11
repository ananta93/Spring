package com.ananta.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ananta.bean.EclipseBean;

public class EclipseTester {
	
	public static void main(String[] args){
	
	String file="spring.xml";
	ApplicationContext container=new ClassPathXmlApplicationContext(file);
	EclipseBean bean=container.getBean(EclipseBean.class);
	bean.run();
	}

}

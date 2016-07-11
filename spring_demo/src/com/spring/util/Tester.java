package com.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.bean.EclipseBean;
import com.spring.bean.RocketBean;
import com.spring.bean.WatchBean;

public class Tester {

	private static ApplicationContext container;

	public static void main(String[] args) {
		String file="spring.xml";
		
		container = new ClassPathXmlApplicationContext(file);
		WatchBean watch=container.getBean(WatchBean.class);
		watch.run();
		
		
		//eclipse object
		EclipseBean eclipse=container.getBean(EclipseBean.class);		
		eclipse.runJava();
		/*
		//rocket object
		RocketBean rocket=(RocketBean) container.getBean("RocketBean.class");
		System.out.println(rocket.getCountry());
		*/
		
		System.out.println(container.getBeanDefinitionCount());

		
	}

}

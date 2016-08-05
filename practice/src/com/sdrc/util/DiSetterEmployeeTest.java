package com.sdrc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sdrc.beans.DiSetterEmployeeBean;

public class DiSetterEmployeeTest {
	private static ApplicationContext context;

	public static void main(String[] args){
	
		context = new ClassPathXmlApplicationContext("disetter.xml");
	
		DiSetterEmployeeBean bean=context.getBean(DiSetterEmployeeBean.class);
		
		bean.display();
	}

}

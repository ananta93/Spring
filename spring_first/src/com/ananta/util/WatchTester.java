package com.ananta.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ananta.bean.WatchBean;

public class WatchTester {

	public static void main(String[] args){
		
		String file="spring.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(file);
		System.out.println("Container created");
		if(container!=null){
		WatchBean watch=container.getBean(WatchBean.class);
		watch.displayTime();
		}
		
		
		
		//WatchBean timex=new WatchBean();
		//timex.displayTime();
	}
}

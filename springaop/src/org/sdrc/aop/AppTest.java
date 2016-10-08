package org.sdrc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		// CustomerService customerService=(CustomerService)
		// applicationContext.getBean("customerService");
		CustomerService customerService = applicationContext.getBean("customerServiceProxy", CustomerService.class);
		System.out.println("=======================================");
		System.out.println("Customer name : " + customerService.getCustomerName());
		System.out.println("=======================================");
		System.out.println("Customer Url is : " + customerService.getUrl());
		try {
			System.out.println("==============And when exception is caught============");
			customerService.printThrowException();

		} catch (Exception e) {
		}
	}

}

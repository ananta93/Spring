package org.sdrc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAopMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringCustomer.xml");
		CustomerBro customerBro=(CustomerBro) applicationContext.getBean("customerBroBean");
		customerBro.addCustomer();
		customerBro.addCustomerAround("Ananta");
		customerBro.addCustomerReturnValue();
		try{
			customerBro.addCustomerThrowException();
		}catch(Exception e){
			
		}
	}
}

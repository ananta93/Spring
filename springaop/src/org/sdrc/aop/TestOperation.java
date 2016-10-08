package org.sdrc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOperation {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfig.xml");
	Operation operation=(Operation)applicationContext.getBean("operationBean");
	System.out.println("Calling message");
	operation.messageFirst();
	System.out.println("this is message second");
	operation.messageInt();
	System.out.println("This is message third");
	operation.messageInt();
}
	

}

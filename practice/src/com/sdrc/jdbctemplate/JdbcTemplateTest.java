package com.sdrc.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {
	
	private static ApplicationContext context;

	public static void main(String[] args){
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e=new Employee();
		e.setId(101);
		e.setName("Ananta");
		e.setSalary(20000);
		
		EmployeeDao edao=(EmployeeDao) context.getBean("edao");
		int status=edao.saveEmployee(e);
		
		System.out.println(status);
		
		
	}

}

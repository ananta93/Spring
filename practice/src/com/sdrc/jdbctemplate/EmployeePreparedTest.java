package com.sdrc.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeePreparedTest {
	
	private static ApplicationContext context;

	public static void main(String[] args){
		
		context = new ClassPathXmlApplicationContext("jdbcTemplatePrepared.xml");
		
		EmployeePreparedDao dao=(EmployeePreparedDao) context.getBean("edao");
		
		EmployeePrepared e=new EmployeePrepared();
		e.setId(102);
		e.setName("Amit");
		e.setSalary(15000);
		
		dao.saveEmployee(e);
	}

}

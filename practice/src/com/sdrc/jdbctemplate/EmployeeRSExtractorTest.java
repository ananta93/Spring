package com.sdrc.jdbctemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeRSExtractorTest {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("jdbcTemplateRS.xml");
		
		EmployeeRSExtractorDao dao=(EmployeeRSExtractorDao) context.getBean("edao");
		
		List<EmployeeRSExtractor> list=dao.getAllEmployee();
		
		for(EmployeeRSExtractor e:list){
			System.out.println(e);
		}

	}

}

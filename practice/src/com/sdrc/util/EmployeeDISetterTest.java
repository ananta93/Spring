package com.sdrc.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sdrc.beans.EmployeeDISetterBean;

public class EmployeeDISetterTest {

	public static void main(String[] args) {
		
		/*ApplicationContext context=new ClassPathXmlApplicationContext("empaddrsetter.xml");
		
		EmployeeDISetterBean bean=context.getBean(EmployeeDISetterBean.class);
		bean.display();
		*/
		 Resource r=new ClassPathResource("empaddrsetter.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    EmployeeDISetterBean employee=(EmployeeDISetterBean)factory.getBean("emp");  
		    employee.display();  

	}

}

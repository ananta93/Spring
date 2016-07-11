package com.ananta.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ananta.bean.ShopBean;

public class SiTester {

	public static void main(String[] args) {
		String fileName="spring.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(fileName);
		ShopBean bean=container.getBean(ShopBean.class);
		bean.buying();

	}

}

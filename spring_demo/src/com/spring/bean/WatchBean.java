package com.spring.bean;

import java.util.Date;

public class WatchBean {

	private String brand;

	public WatchBean() {
		System.out.println("Watch Created");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void run(){
		System.out.println(new Date());
	}
	
}

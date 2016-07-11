package com.ananta.bean;

import java.util.Date;

public class WatchBean {
	
	private String brand;
	public WatchBean(){
		System.out.println("inside constructor");
	}
	public void displayTime(){
		System.out.println(new Date());
	}

}

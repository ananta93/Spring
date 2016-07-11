package com.spring.bean;

public class RocketBean {
	private String Country;
	private String launchingFrom;
	private boolean launched;
	
	public RocketBean(String country, String launchingFrom) {
		Country = country;
		this.launchingFrom = launchingFrom;
		System.out.println("Rocket created");
		
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getLaunchingFrom() {
		return launchingFrom;
	}
	public void setLaunchingFrom(String launchingFrom) {
		this.launchingFrom = launchingFrom;
	}
	public boolean isLaunched() {
		return launched;
	}
	public void setLaunched(boolean launched) {
		this.launched = launched;
	}
	
}

package com.spring.bean;

public class EclipseBean {
	private String version;
	
	public EclipseBean(String version) {
		this.version = version;
		System.out.println("Eclipse Created");
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public void runJava(){
		System.out.println("Running Java");
	}
}

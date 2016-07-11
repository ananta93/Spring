package com.ananta.bean;

public class EclipseBean {
	
	private String version;
	private String owner;
	public EclipseBean(String version){
		this.version=version;
		System.out.println("The version of eclipse is "+version);
	}
	public EclipseBean(String version,String owner){
		this.version=version;
		this.owner=owner;
		
		System.out.println("The version of eclipse is "+version);
		System.out.println("The owner of eclipse is "+owner);
	}
	
	public void run(){
		System.out.println("the run method called");
	}

}

package org.sdrc.aop;

public class Operation {

	
	public Operation() {
		super();
		System.out.println("Constructor called");
	}
	public void messageFirst(){
		System.out.println("Message first print");
	}
	public int messageInt(){
		System.out.println("Second method invoked");
		return 2;
	}
	
/*	public int messageLast(){
		System.out.println("Last message invoked");
		return 5;
	}*/
}

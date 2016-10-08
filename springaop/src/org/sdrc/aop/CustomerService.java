package org.sdrc.aop;

public class CustomerService {
	
	private String customerName;
	private String url;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void printCustomerName(){
		System.out.println("The customer name is : "+this.customerName);
	}
	public void customerUrl(){
		System.out.println("The customer url is : "+this.url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}

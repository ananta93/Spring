package org.sdrc.aop;

public class CustomerBroImpl implements CustomerBro {

	@Override
	public void addCustomer() {
		System.out.println("addCustomer() is running now");
		
	}

	@Override
	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue() is running now");
		return "hello";
	}

	@Override
	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running and the cutomer name is : "+name);
	}

	@Override
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("General Exception");
	}
}

package org.sdrc.aop;

public interface CustomerBro {
	 void addCustomer();
	 String addCustomerReturnValue();
	 void addCustomerAround(String name);
	 void addCustomerThrowException() throws Exception;

}

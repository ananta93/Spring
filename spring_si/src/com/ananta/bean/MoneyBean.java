package com.ananta.bean;

public class MoneyBean {
	
	private String currency;
		
	public MoneyBean() {
		System.out.println("Money Bean Created");
	}

	public void buying(){
		System.out.println("Things bought...");
	}
	public void setCurrency(String currency){
		this.currency=currency;
	}

}

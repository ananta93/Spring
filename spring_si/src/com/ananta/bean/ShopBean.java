package com.ananta.bean;

public class ShopBean {
	private String name;
	private MoneyBean money;
	
	public ShopBean(MoneyBean bean) {
		System.out.println("Your shopping starts here...");
		this.money=bean;
	}
	public void buying(){
		System.out.println("shop bought");
	}
	public void setName(String name){
		this.name=name;
	}
}

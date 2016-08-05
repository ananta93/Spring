package com.sdrc.beans;

public class EmployeeDISetterBean {
	
	private int eid;
	private int ename;
	private AddressDISetter address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEname() {
		return ename;
	}
	public void setEname(int ename) {
		this.ename = ename;
	}
	public AddressDISetter getAddress() {
		return address;
	}
	public void setAddress(AddressDISetter address) {
		this.address = address;
	}
	
	public void display(){
		System.out.println(eid+" "+ename);
	}
}

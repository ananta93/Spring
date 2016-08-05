package com.sdrc.beans;

public class AddressDISetter {
	
	private String cname;
	private String city;
	private String state;
	private String country;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "AddressDISetter [cname=" + cname + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}

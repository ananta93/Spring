package com.sdrc.jdbctemplate;

public class EmployeeRSExtractor {
	
	private int id;
	private String name;
	private int salry;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalry() {
		return salry;
	}
	public void setSalry(int salry) {
		this.salry = salry;
	}
	@Override
	public String toString() {
		return "EmployeeRSExtractor [id=" + id + ", name=" + name + ", salry=" + salry + "]";
	}
	
	

}

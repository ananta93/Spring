package com.sdrc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentDto {
	
	public StudentDto(){
		System.out.println("it is working");
	}
	
	@Id
	@Column(name="sid")
	private int sid;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="saddr")
	private String saddr;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public void display(){
		System.out.println("The name is : "+getSname());
	}
	
	
}

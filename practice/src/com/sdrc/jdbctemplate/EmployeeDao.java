package com.sdrc.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;


public class EmployeeDao {
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int saveEmployee(Employee e){
		String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jt.update(query);
	}
	

}

//EmployeeDAO.java

package com.dao;

import org.springframework.jdbc.core.*;

import java.util.*;

public class EmployeeDAO implements EmployeeDAOI{
	
	private JdbcTemplate jt;

	public EmployeeDAO(JdbcTemplate jt){
		this.jt=jt;
	}
	
	public List<Map> getAllEmps(){
		return jt.queryForList("SELECT * FROM Emp");
	}
}
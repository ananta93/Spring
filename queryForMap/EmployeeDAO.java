//EmployeeDAO.java

package com.dao;

import org.springframework.jdbc.core.*;

import java.util.*;

public class EmployeeDAO implements EmployeeDAOI{
	
	private JdbcTemplate jt;

	public EmployeeDAO(JdbcTemplate jt){
		this.jt=jt;
	}
	
	public Map getEmp(int empno){
		return jt.queryForMap("SELECT * FROM Emp WHERE empno="+empno);
	}
}
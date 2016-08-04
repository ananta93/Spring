//EmployeeDAO.java

package com.dao;

import org.springframework.jdbc.core.*;

public class EmployeeDAO implements EmployeeDAOI{
	
	private JdbcTemplate jt;

	public EmployeeDAO(JdbcTemplate jt){
		this.jt=jt;
	}

	public int getEmpDeptno(int empno){
		return jt.queryForInt("SELECT deptno FROM Emp WHERE empno="+empno);
	}

	public long getEmpsCount(){
		return jt.queryForLong("SELECT Count(*) FROM Emp");
	}

	public String getEmpName(int empno){
		return (String)jt.queryForObject("SELECT ename FROM Emp WHERE empno="+empno,String.class);
	}

}
//EmployeeDAO.java

package com.dao;

import org.springframework.jdbc.core.*;
import java.sql.*;
import java.util.*;

import com.dao.EmpExtractor;
import com.dao.EmpHandler;
import com.dao.EmpMapper;

import com.dao.Employee;

public class EmployeeDAO implements EmployeeDAOI{
	
	private JdbcTemplate jt;
	private EmpExtractor ee;
	private EmpHandler eh;
	private EmpMapper em;


	public EmployeeDAO(JdbcTemplate jt){this.jt=jt;}

	public void setEmpExtractor(EmpExtractor ee){this.ee=ee;}

	public void setEmpHandler(EmpHandler eh){this.eh=eh;}

	public void setEmpMapper(EmpMapper em){this.em=em;}

	public Employee getEmployee(int empno){
		return (Employee)jt.query("SELECT * FROM Emp WHERE empno="+empno,ee);
	}

	public void showAllEmployees()
	{
		jt.query("SELECT * FROM Emp",eh);
	}

	public List<Employee> getAllEmployees(){
		return (List<Employee>)jt.query("SELECT * FROM Emp",em);
	}

	public List<Employee> getEmpsByDept(int deptno){
		return (List<Employee>)jt.query("SELECT * FROM Emp WHERE deptno=?",new Object[]{deptno},em);
	}
}
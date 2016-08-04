//EmployeeDAO.java

package com.dao;

import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.support.*;
import java.sql.*;

public class EmployeeDAO extends JdbcDaoSupport implements EmployeeDAOI{
	
	public void updateSalary(int empno,double sal){
		getJdbcTemplate().update("UPDATE Emp SET sal=? WHERE empno=?",new Object[]{sal,empno});
	}
}
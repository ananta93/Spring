//EmployeeDAO.java

package com.dao;

import org.springframework.jdbc.core.*;
import java.sql.*;

public class EmployeeDAO implements EmployeeDAOI{
	
	private JdbcTemplate jt;

	public EmployeeDAO(JdbcTemplate jt){
		this.jt=jt;
	}

	public void save(final Employee e){
		PreparedStatementSetter pss=new PreparedStatementSetter()
		{
			public void setValues(PreparedStatement ps)throws SQLException
			{
				ps.setInt(1,e.empno);
				ps.setString(2,e.ename);
				ps.setDouble(3,e.sal);
				ps.setInt(4,e.deptno);
			}
		};
		
		jt.update("INSERT INTO Emp VALUES(?,?,?,?)",pss);
	}

	public void remove(int empno){
		jt.update("DELETE FROM Emp WHERE empno="+empno);
	}

	public void updateSalary(int empno,double sal){
		jt.update("UPDATE Emp SET sal=? WHERE empno=?",new Object[]{sal,empno});
	}

	public void updateDept(int empno,int deptno){
		jt.update("UPDATE Emp SET deptno=? WHERE empno=?",new Object[]{deptno,empno});
	}
}
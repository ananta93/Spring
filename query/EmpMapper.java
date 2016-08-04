//EmpMapper.java

package com.dao;

import org.springframework.jdbc.core.*;
import java.sql.*;

public class EmpMapper implements RowMapper{
	public Object mapRow(ResultSet rs,int i)throws SQLException{
		Employee e=new Employee();
		e.empno=rs.getInt(1);
		e.ename=rs.getString(2);
		e.sal=rs.getDouble(3);
		e.deptno=rs.getInt(4);

		return e;
	}
}
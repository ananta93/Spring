//EmpExtractor.java

package com.dao;

import org.springframework.jdbc.core.*;
import java.sql.*;

public class EmpHandler implements RowCallbackHandler{
	public void processRow(ResultSet rs)throws SQLException{
		/*
		Employee e=new Employee();
		e.empno=rs.getInt(1);
		e.ename=rs.getString(2);
		e.sal=rs.getDouble(3);
		e.deptno=rs.getInt(4);
		*/
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getInt(4));
	}
}
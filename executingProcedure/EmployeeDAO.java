//EmployeeDAO.java

package com.dao;

import org.springframework.jdbc.core.*;

import java.util.*;
import java.sql.*;

public class EmployeeDAO implements EmployeeDAOI{
	
	private JdbcTemplate jt;

	public EmployeeDAO(JdbcTemplate jt){
		this.jt=jt;
	}
	
	public String getEmpName(final int empno)
	{
		CallableStatementCreator csc=new CallableStatementCreator()
		{
			public CallableStatement createCallableStatement(Connection con)throws SQLException{
				CallableStatement cs=con.prepareCall("{call getEmpName(?,?)}");
				cs.setInt(1,empno);
				cs.registerOutParameter(2,Types.LONGVARCHAR);

				return cs;
			}
		};
		List l=new ArrayList();
		l.add(new SqlParameter(Types.INTEGER));
		l.add(new SqlOutParameter("ename",Types.LONGVARCHAR));

		Map m=jt.call(csc,l);

		String s=(String)m.get("ename");  // here "ename" is the name of the OUT parameter, specified using SqlOutParameter in the List l(line no 32)

		return s;
	}
}
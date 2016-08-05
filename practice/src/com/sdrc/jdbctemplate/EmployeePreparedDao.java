package com.sdrc.jdbctemplate;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeePreparedDao {
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public boolean saveEmployee(EmployeePrepared e){
		
		String query="insert into employee values(?,?,?)";
		
		return jt.execute(query, new PreparedStatementCallback<Boolean>() {
			
			@Override
			public Boolean doInPreparedStatement(java.sql.PreparedStatement ps)
					throws SQLException, DataAccessException {
				
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setInt(3, e.getSalary());
				return ps.execute();
			}
			
		});
	}

}

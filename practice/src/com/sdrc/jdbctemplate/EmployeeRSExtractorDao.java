package com.sdrc.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeRSExtractorDao {
	
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<EmployeeRSExtractor> getAllEmployee(){
		String query="select * from employee";
		return template.query(query,new ResultSetExtractor<List<EmployeeRSExtractor>>() {

			@Override
			public List<EmployeeRSExtractor> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<EmployeeRSExtractor> l=new ArrayList<EmployeeRSExtractor>();
				while (rs.next()) {
					EmployeeRSExtractor es=new EmployeeRSExtractor();
					es.setId(rs.getInt(1));
					es.setName(rs.getString(2));
					es.setSalry(rs.getInt(3));
					l.add(es);
				}
				return l;
			}
		});
	}

}

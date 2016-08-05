package com.sdrc.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MsSqlConnection {

	public static void main(String[] args) throws Exception {
		
		String sql="SELECT * FROM STUDENT WHERE SID=101";
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ananta", "sa", "pass123");
		Statement st=con.createStatement();
		
		if(con!=null){
			
			DatabaseMetaData dm=con.getMetaData();
			System.out.println("Drivername: "+dm.getDriverName());
			System.out.println("JDBC Url: "+dm.getURL());
			System.out.println("Username: "+dm.getUserName());
			System.out.println("Database: "+dm.getSchemas());
			
		}
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			System.out.println("SID : "+rs.getInt(1)+" Sname : "+rs.getString(2)+" saddr : "+rs.getString(3));
		}

	}

}

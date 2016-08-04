//EmployeeDAOI.java

package com.dao;

public interface EmployeeDAOI{
	int getEmpDeptno(int empno);
	String getEmpName(int empno);
	long getEmpsCount();
}
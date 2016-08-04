//EmployeeDAOI.java

package com.dao;

public interface EmployeeDAOI{
	void save(Employee e);
	void updateSalary(int empno,double sal);
	void updateDept(int empno,int deptno);
	void remove(int empno);
}
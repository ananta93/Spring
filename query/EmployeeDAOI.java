//EmployeeDAOI.java

package com.dao;

import java.util.*;

public interface EmployeeDAOI{
	Employee getEmployee(int empno);
	List<Employee> getAllEmployees();
	List<Employee> getEmpsByDept(int deptno);
	void showAllEmployees();
}
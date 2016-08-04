//EmployeeDAOI.java

package com.dao;

import java.util.*;

public interface EmployeeDAOI{
	String getEmpName(int eno);
}

/*

CREATE OR REPLACE PROCEDURE getEmpName(eno NUMBER,en OUT VARCHAR2)
AS
BEGIN
	SELECT ename INTO en FROM Emp WHERE empno=eno;
END;

*/
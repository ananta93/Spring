//TestCase.java

import org.springframework.context.*;
import org.springframework.context.support.*;

import java.util.*;

import com.dao.EmployeeDAOI;
import com.dao.Employee;

public class TestCase{

	public static void main(String []args)throws Exception{
		ApplicationContext beans=new ClassPathXmlApplicationContext("mybeans.xml");

		EmployeeDAOI edao=(EmployeeDAOI)beans.getBean("edao");

		Map m=edao.getEmp(new Integer(args[0]));
		System.out.println(m.get("EMPNO")+"\t"+m.get("ENAME")+"\t"+m.get("SAL")+"\t"+m.get("DEPTNO"));
		//System.out.println(m.get("empno")+"\t"+m.get("ename")+"\t"+m.get("sal")+"\t"+m.get("deptno")); // null  null  null  null
		// the i/p to the get() method should be column name (column names are case sensitive)
	}
}
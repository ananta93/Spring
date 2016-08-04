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

		Employee e=edao.getEmployee(Integer.parseInt(args[0]));
		System.out.println("Employee Details of Employee:"+args[0]);
		System.out.println(e.empno+"\t"+e.ename+"\t"+e.sal+"\t"+e.deptno);
		
		System.out.println("================");
		edao.showAllEmployees();
		System.out.println("================");
		
		System.out.println("All Employees Details");
		List<Employee> emps=edao.getAllEmployees();
		for(Employee e1 : emps){
			System.out.println("\t"+e1.empno+"\t"+e1.ename+"\t"+e1.sal+"\t"+e1.deptno);
		}

		System.out.println("Employee Details of Dept:"+args[1]);
		List<Employee> emps1=edao.getEmpsByDept(new Integer(args[1]));
		for(Employee e2 : emps1){
			System.out.println("\t"+e2.empno+"\t"+e2.ename+"\t"+e2.sal+"\t"+e2.deptno);
		}
	}
}
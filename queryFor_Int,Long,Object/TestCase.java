//TestCase.java

import org.springframework.context.*;
import org.springframework.context.support.*;

import com.dao.EmployeeDAOI;
import com.dao.Employee;

public class TestCase{

	public static void main(String []args)throws Exception{
		ApplicationContext beans=new ClassPathXmlApplicationContext("mybeans.xml");

		EmployeeDAOI edao=(EmployeeDAOI)beans.getBean("edao");

		System.out.println("Deptno:"+edao.getEmpDeptno(new Integer(args[0])));
		System.out.println("Emps Count:"+edao.getEmpsCount());
		System.out.println("Emp Name:"+edao.getEmpName(new Integer(args[1])));
	}
}
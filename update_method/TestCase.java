//TestCase.java

import org.springframework.context.*;
import org.springframework.context.support.*;

import com.dao.EmployeeDAOI;
import com.dao.Employee;

public class TestCase{

	public static void main(String []args)throws Exception{
		ApplicationContext ac=new ClassPathXmlApplicationContext("mybeans.xml");

		EmployeeDAOI edao=(EmployeeDAOI)ac.getBean("edao");

		edao.updateSalary(new Integer(args[0]),new Double(args[1]));

		Employee e=new Employee();
		e.empno=Integer.parseInt(args[2]);
		e.ename="newEmp";
		e.sal=1000;
		e.deptno=10;

		edao.save(e);

		edao.remove(new Integer(args[3]));

		edao.updateDept(new Integer(args[4]),50);
	}
}
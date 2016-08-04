//TestCase.java

import org.springframework.context.*;
import org.springframework.context.support.*;

import com.dao.EmployeeDAOI;
import com.dao.Employee;

public class TestCase{

	public static void main(String []args)throws Exception{
		ApplicationContext beans=new ClassPathXmlApplicationContext("mybeans.xml");

		EmployeeDAOI edao=(EmployeeDAOI)beans.getBean("edao");

		edao.updateSalary(new Integer(args[0]),new Double(args[1]));
		System.out.println("Emp Salary Updated Successfully");
	}
}
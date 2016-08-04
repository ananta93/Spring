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

		System.out.println("Employee Name:"+edao.getEmpName(new Integer(args[0])));
	}
}
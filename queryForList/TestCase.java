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

		List<Map> l=edao.getAllEmps();
		for(Map m : l){
			System.out.println(m.get("EMPNO")+"\t"+m.get("ENAME"));
			//System.out.println(m.get("empno")+"\t"+m.get("ename"));
		}
	}
}
package com.sdrc.util;

import com.sdrc.dao.StudentDao;
import com.sdrc.dto.StudentDto;

public class StudentTest {
	
	public StudentTest(){
		System.out.println("main is also working fine");
	}

	public static void main(String[] args) {
		
		StudentDto dto=new StudentDto();
		dto.setSid(105);
		dto.setSname("Prangyan");
		dto.setSaddr("Cuttack");
		
		StudentDao dao=new StudentDao();
		dao.save(dto);

	}

}

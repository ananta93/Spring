package com.sdrc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sdrc.dto.StudentDto;

public class StudentDao {
	
	
	public StudentDao(){
		System.out.println("it is also working fine");
	}
	
	public void save(StudentDto dto){
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(StudentDto.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		
	}

}

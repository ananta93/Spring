package org.sdrc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

/*	
 * Without applying pointcuts
 * 
 * 
	@Before("execution(* get*(..))")// 0 or more arguments in get()
	public void loggingAdvice(){
		System.out.println("LoggingAdviced executed before Get");
	}
	
	@Before("execution(* get*(..))")
	public void secondAdvice(){
		System.out.println("This is the second advice method");
	}*/
	
	/*
	 * Applying pointcuts
	*/
	
	@Before("allGetters()")
	public void loggingAdvice(){
		System.out.println("LoggingAdviced executed before Get");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("This is the second advice method");
	}
	
	@Pointcut("execution(* get*(..))")
	public void allGetters() {}
}

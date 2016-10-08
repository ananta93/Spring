package org.sdrc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingCustomerAspect {
	
	@Before("allAdd()")
	public void loggingBefore(JoinPoint joinPoint){
		System.out.println("loggingBefore() is running");
		System.out.println("Hijacked "+joinPoint.getSignature().getName());
		System.out.println("==============================================");	
	}
	
	@After("allAdd()")
	public void loggingAfter(JoinPoint joinPoint){
		System.out.println("loggingAfter() is running");
		System.out.println("Hijacked after "+joinPoint.getSignature().getName());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}
	
	@Pointcut("execution(* add*(..))")
	public void allAdd(){}

}

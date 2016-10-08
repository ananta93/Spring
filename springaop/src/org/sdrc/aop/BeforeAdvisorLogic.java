package org.sdrc.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisorLogic implements MethodBeforeAdvice, AfterReturningAdvice  {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("****************************************************************");
		System.out.println("This should be executed before the invokation of current logic");
		
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("This should be executed after the invokation of current logic");
		
	}
}

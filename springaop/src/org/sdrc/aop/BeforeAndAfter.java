package org.sdrc.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;abstract
public class BeforeAndAfter implements MethodBeforeAdvice, AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		
	}
	

}

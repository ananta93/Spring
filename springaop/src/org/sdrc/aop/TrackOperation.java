package org.sdrc.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	
	@Pointcut("execution(* Operation.*(..))")
	public void messageInt(){} /*point cut name*/

	@Before("messageInt()")
	public void myAdvice(Joinpoint join){
		System.out.println("Additional info");
	}
}
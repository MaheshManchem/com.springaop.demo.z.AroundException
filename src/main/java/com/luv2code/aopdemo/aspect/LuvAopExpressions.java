package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {
	
	@Pointcut("execution(public void addAccount(..))")
	public void AopAspect() {}
	
	@Pointcut("execution(public void set*(*))")
	public void setter() {}
	
	@Pointcut("execution(public * get*())")
	public void getter() {} 
	
}

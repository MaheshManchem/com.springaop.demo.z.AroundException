package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyAopNoSetterNoGetter {
	
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.AopAspect() && !(com.luv2code.aopdemo.aspect.LuvAopExpressions.setter() && "
			+ "com.luv2code.aopdemo.aspect.LuvAopExpressions.getter())")
	public void beforesetter() {
		System.out.println("======> before setter method and getter method");
	}
	
}

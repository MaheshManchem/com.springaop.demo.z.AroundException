package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(3)
public class MyAopAopAspect {
	
	@AfterReturning(
			pointcut ="execution(* com.luv2code.aopdemo.dao.AccountDao.findAccounts())",
			returning = "result")
	public void afterFindingAccountsAspect(JoinPoint thejoinpoint,List<Account> result) {
		System.out.println("====> After returning aspect in Aspect class");
		String method = thejoinpoint.getSignature().toShortString();
		System.out.println("Method name:"+method);
		System.out.println("result"+result);
		
		//change the output format
		changetheformatofnames(result);
		System.out.println("result"+result);
	}
	
	private void changetheformatofnames(List<Account> result) {
		// TODO Auto-generated method stub
		for(Account temp:result) {
			String uppercasename = temp.getAccountname().toUpperCase();
			temp.setAccountname(uppercasename);
		}
	}

	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.AopAspect()")
	public void beforeaddAccount(JoinPoint thejoinpoint) {
		
		System.out.println("====> in my loggingaspect: before addacount");
		MethodSignature methodsign = (MethodSignature) thejoinpoint.getSignature();
		System.out.println("method Signature:" +methodsign);
		
		Object[] args = thejoinpoint.getArgs();
		for(Object arg:args) {
			System.out.println(arg);
		}
	}
	
	
}

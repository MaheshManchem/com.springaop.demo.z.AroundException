package com.luv2code.aopdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MydemoLoginAspect {
	
	Logger mylogger = Logger.getLogger(getClass().getName());
	
	@Around("execution(* com.luv2code.aopdemo.service.FortuneService.getFortuneService())")
	public Object aroundServiceFortune(
			ProceedingJoinPoint thejoinpoint) throws Throwable {
		
		mylogger.info("in the around Service Fortune Aspect method");
		long starttime = System.currentTimeMillis();
		Object result = null;
		
		try {
			result = thejoinpoint.proceed();
		} catch (Exception e) {
			// lof the exception
			mylogger.warning(e.getMessage());
			
			//give message
			result = "              handled in the aspect class";
		}
		
		
		long endtime  = System.currentTimeMillis();
		
		
		long timeresult = endtime-starttime;
		mylogger.info("Total Time:"+timeresult);
		return result;
	}
	
	@AfterThrowing(
			pointcut="execution(* com.luv2code.aopdemo.dao.AccountDao.findAccounts(boolean))",
			throwing="theExe")
	public void afterthrowingFindAccountAdvice(JoinPoint thejoinpoint, Throwable theExe) {
		mylogger.info("in advice aspect after throwing");
	}
	
	@After("com.luv2code.aopdemo.aspect.LuvAopExpressions.AopAspect()")
	public void beforeSillyAccount() {
		mylogger.info("====> After silly account in class");
	}
	
	
	
}

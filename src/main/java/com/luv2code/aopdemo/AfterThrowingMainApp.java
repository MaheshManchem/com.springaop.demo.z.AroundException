package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDao;
import com.luv2code.aopdemo.dao.MemberShipDao;

public class AfterThrowingMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read springconfig
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao theAccountDao = config.getBean("accountDao",AccountDao.class);
		
		List<Account> theaccounts = null; 
		try {
			boolean tripwire = true;
			theaccounts = theAccountDao.findAccounts(tripwire);
		}catch(Exception exc) {
			System.out.println("Exception caught in catch block::"+exc);
		}
		
		//Display Accounts here
		System.out.println("======> in main app after throwing");
		System.out.println(theaccounts);
		config.close();
		}

}

package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDao;
import com.luv2code.aopdemo.dao.MemberShipDao;

public class MainDemoApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read springconfig
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao theAccountDao = config.getBean("accountDao",AccountDao.class);
		
		List<Account> theaccounts = theAccountDao.findAccounts(false);
		System.out.println(theaccounts);
		config.close();
		}

}

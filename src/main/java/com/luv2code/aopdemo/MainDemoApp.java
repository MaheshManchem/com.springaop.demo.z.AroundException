package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDao;
import com.luv2code.aopdemo.dao.MemberShipDao;

public class MainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read springconfig
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao theAccountDao = config.getBean("accountDao",AccountDao.class);
		MemberShipDao themembershipdao = config.getBean("memberShipDao", MemberShipDao.class);
		
		Account theaccount = new Account();
		theaccount.setAccountname("maheshraju");
		Boolean flag = true;
		
		theAccountDao.addAccount(theaccount,flag);
		
		//calling getter and setter methods
		theAccountDao.setName("suresh");
		theAccountDao.setServicecode("service code");
		
		theAccountDao.getName();
		theAccountDao.getServicecode();
		themembershipdao.addsilly();
		
		config.close();
		}

}

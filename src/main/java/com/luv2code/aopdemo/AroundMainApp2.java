package com.luv2code.aopdemo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDao;
import com.luv2code.aopdemo.dao.MemberShipDao;
import com.luv2code.aopdemo.service.FortuneService;

public class AroundMainApp2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Read springconfig
		
		Logger mylogger = Logger.getLogger(AroundMainApp2.class.getName());
		
		
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		FortuneService thefortuneservice = config.getBean("fortuneService",FortuneService.class);
		
		mylogger.info("inMain App");
		mylogger.info("Calling Fortune service");
		boolean tripwire = true;
		String data = thefortuneservice.getFortuneService(tripwire);
		mylogger.info("In main demo - got data from fortune service:"+data);
		mylogger.info("finished");
		
		config.close();
		}

}

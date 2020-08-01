package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;
@Component
public class FortuneService {
	public String getFortuneService() {
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Return statement";
		
	}

	public String getFortuneService(boolean tripwire) throws Exception {
		// TODO Auto-generated method stub
		
		if(tripwire) {
			throw new Exception("exception thrown in getFortuneService method");
		}
		return getFortuneService();
	}
}

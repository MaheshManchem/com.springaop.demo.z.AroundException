package com.luv2code.aopdemo.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDao {
	private String name;
	private String servicecode;
	
	public List<Account> findAccounts(boolean tripwire){
		if(tripwire) {
			throw new RuntimeException("this is an exception");
		}
		
		List<Account> myaccounts = new ArrayList<Account>();
		
		// create accounts and add them
		Account a1 = new Account("MaheshAct1",123);
		Account a2 = new Account("RajuAct2",234);
		Account a3 = new Account("ManchemAct3",345);
		
		myaccounts.add(a1);
		myaccounts.add(a2);
		myaccounts.add(a3);
		
		return myaccounts;
	}
	
	public void addAccount(Account a, Boolean flag){
		System.out.println(a.getAccountname() +"in account dao:addaccount method");
	}

	public String getName() {
		System.out.println("name in Getname method:"+name);
		return name;
	}

	public void setName(String name) {
		System.out.println("name in Setname method:"+name);
		this.name = name;
	}

	public String getServicecode() {
		System.out.println("name in Getservicecode method:"+servicecode);
		return servicecode;
	}

	public void setServicecode(String servicecode) {
		System.out.println("name in setservicecode method:"+servicecode);
		this.servicecode = servicecode;
	}
	
	
}

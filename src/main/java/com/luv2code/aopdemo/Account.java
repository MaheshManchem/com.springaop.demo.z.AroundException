package com.luv2code.aopdemo;

public class Account {
	private String accountname;
	private int accountnumber;
	
	public Account() {
		
	}
	
	public Account(String accountname, int accountnumber) {
		super();
		this.accountname = accountname;
		this.accountnumber = accountnumber;
	}
	
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "Account [accountname=" + accountname + ", accountnumber=" + accountnumber + "]";
	}
	
	
}

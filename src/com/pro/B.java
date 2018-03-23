package com.pro;
/*
@author:Mayuresh Vartak
*/

import com.main.Customer;
import com.main.Withdraw;

public class B implements Withdraw{
	double balance;
	double amount;
	

	@Override
	public void withdraw(Customer c, double amount) {
		System.out.println(c.getBalance());
		this.balance=c.getBalance();
		this.amount=amount;
		
		c.setBalance(update());
	}
	public double update() {
	this.balance=this.balance+amount;
	return balance;
	}

}

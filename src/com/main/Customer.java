package com.main;

/*
@author:Mayuresh Vartak
*/

import java.util.Scanner;

import com.pro.A;
import com.pro.B;

public class Customer {
 
	private String name;
	private double balance;
	private double amount;
	B b=new B();
	A a=new A();
	public Customer(String name, double d) {
		super();
		this.name = name;
		this.balance = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
  void deposit() {
	  System.out.println("Enter the amount to deposit");
	  Scanner d=new Scanner(System.in);
			  this.amount=d.nextInt();
		          balance=balance+amount;
			  a.update();
			  
			 
			
  }

    void withdraw() {
        System.out.println("Enter the amount to withdraw");
     Scanner w=new Scanner(System.in);
     this.amount=w.nextInt();
     balance=balance-amount;
     b.update();
     w.close();
    }
  
}

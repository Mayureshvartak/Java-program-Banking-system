package com.main;
/*
@author:Mayuresh Vartak
*/
public class App {

	public static void main(String[] args) {

		
Customer c=new Customer("Akash",5000.00);
System.out.println("The initial balance is :"+c.getBalance());
c.deposit();
System.out.println("The final balance is :"+c.getBalance());
c.withdraw();
System.out.println("The final balance is :"+c.getBalance());

	}

}

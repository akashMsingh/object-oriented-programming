package com.opps.constructor;
/*Write a Java program to create a class called Account with instance variables 
 * accountNumber and balance. Implement a parameterized constructor that initializes 
 * these variables with validation:
 * 
 * accountNumber should be non-null and non-empty.
 * balance should be non-negative.
 * Print an error message if the validation fails.*/
public class Account {
	private String accountNumber;
	private double balance;
	// Parameterized constructor with validation
	public Account(String accountNumber,double balance) {
		if(accountNumber==null||accountNumber.isEmpty()) {
			System.err.println("Error:accountNumber should be non-null and non-empty");
			return ;
		}
		if(balance<0) {
			System.err.println("Error: balance should be non-negative");
			return;
		}
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public static void main(String[] args) {
		Account a1=new Account("123456787", 99999.0);// Test with valid data
		System.out.println("Account Number: "+a1.accountNumber);
		System.out.println("Account Balance: "+a1.balance);
		System.out.println("==============================");
		new Account("", 76553.9);// Test with invalid accountNumber
		System.out.println("==============================");
		new Account("9876543", -10);// Test with invalid balance
	}
}

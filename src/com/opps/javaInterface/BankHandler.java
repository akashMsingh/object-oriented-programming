package com.opps.javaInterface;

public class BankHandler {
	public static void main(String[] args) {
		Bank bank=new Bank();
		SavingsAccount savingsAccount=new SavingsAccount("SBI67483", 50000.0, 3.0);
		CurrentAccount currentAccount=new CurrentAccount("PNB987", 760000.0, 5000.0, 5.0);
		// Add the SavingsAccount and CurrentAccount to the bank
		bank.addAccount(currentAccount);
		bank.accountBalance(savingsAccount);
		
		System.out.println("===================Saving Account=================");
		System.out.println("Account Number of Saving Account: "+bank.accountNumber(savingsAccount));
		System.out.println("Saving Account Initial Balance: "+bank.accountBalance(savingsAccount));
		System.out.println("\nNow deposit 4500 to Savings Account.");
		bank.deposit(savingsAccount, 4500);
		System.out.println("Saving Account  Balance: "+bank.accountBalance(savingsAccount));
		System.out.println("Apply Interest...!!");
		bank.accountInterest(savingsAccount);
		System.out.println("Saving Account  Balance: "+bank.accountBalance(savingsAccount));
		System.out.println("==============Current Account=======================");
		System.out.println("Account Number of Current Account: "+bank.accountNumber(currentAccount));
		System.out.println("Current Account Initial Balance: "+bank.accountBalance(currentAccount));
		System.out.println("\nNow deposit 6400 to Current Account.");
		bank.deposit(currentAccount, 6400);
		System.out.println("Current Account Balance: "+bank.accountBalance(currentAccount));
		System.out.println("Apply Interest...!!");
		bank.accountInterest(currentAccount);
		System.out.println("Current Account Balance: "+bank.accountBalance(currentAccount));
	}
}

package com.opps.javaInterface;
/* Write a Java programming to create a banking system with three classes - Bank, Account, 
 * SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods 
 * for adding them. Accounts should be an interface with methods to deposit, withdraw, 
 * calculate interest, and view balances. SavingsAccount and CurrentAccount should implement 
 * the Account interface and have their own unique methods.
 */
public interface Account {
	void deposit(double amount);
	void withdrowl(double amount);
	double getBalance();
	void calculateInterest();
    String getAccountNumber();
}
class SavingsAccount implements Account{
	private String AccountNumber;
	private double balance;
	private double interestRate;
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super();
		AccountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	@Override
	public void deposit(double amount) {
		balance+=amount;
	}
	@Override
	public void withdrowl(double amount) {
		if(balance>=amount) {
			balance-=amount;
		}else {
			System.out.println("Insufficent balance..!");
		}
	}
	@Override
	public double getBalance() {
		return balance;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	@Override
	public void calculateInterest() {
		balance+=balance*interestRate/100;
	}
}
class CurrentAccount implements Account{
	private String AccountNumber;
	private double balance;
	private double overdraftlimit;
	private double interestRate;
	public CurrentAccount(String accountNumber, double balance, double overdraftlimit,double interestRate) {
		AccountNumber = accountNumber;
		this.balance = balance;
		this.overdraftlimit = overdraftlimit;
		this.interestRate=interestRate;
	}
	@Override
	public void deposit(double amount) {
		balance+=amount;
	}
	@Override
	public void withdrowl(double amount) {
		if(balance+overdraftlimit>=amount) {
			balance-=amount;
		}
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public void calculateInterest() {
		balance+=balance*interestRate/100;
	}
	
}
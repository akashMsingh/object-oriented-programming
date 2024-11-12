package com.opps.abstractClasses;
/* Write a Java program to create an abstract class BankAccount with abstract methods 
 * deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend 
 * the BankAccount class and implement the respective methods to handle deposits and withdrawals
 * for each account type.
 */
abstract class BankAccount{
	private String AcocuntNumber;
	private double balance;
	
	public BankAccount(String acocuntNumber, double balance) {
		AcocuntNumber = acocuntNumber;
		this.balance = balance;
	}
	
	public String getAcocuntNumber() {
		return AcocuntNumber;
	}

	public void setAcocuntNumber(String acocuntNumber) {
		AcocuntNumber = acocuntNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	abstract void deposit(double amount);
	abstract void withdrawl(double amount);
}
class SavingAccount extends BankAccount{
	public SavingAccount(String acocuntNumber, double balance) {
		super(acocuntNumber, balance);
	}
	@Override
	void deposit(double amount) {
		setBalance(getBalance()+amount);
		System.out.println("Amount of "+amount+" is deposited successfully ,your current balance is "+getBalance());
	}
	@Override
	void withdrawl(double amount) {
		if(getBalance()>=amount) {
			setBalance(getBalance()-amount);
			System.out.println("Withdrawl of "+amount+" is scuccessfull. your courrent balance: "+getBalance());
		}
		else {
			System.out.println("You have insufficent Balance...!!");
		}
	}
}
class CurrentAccount extends BankAccount{

	public CurrentAccount(String acocuntNumber, double balance) {
		super(acocuntNumber, balance);
	}

	@Override
	void deposit(double amount) {
		setBalance(getBalance()+amount);
	}

	@Override
	void withdrawl(double amount) {
		if(getBalance()>=amount) {
			setBalance(getBalance()-amount);
		}
		System.out.println("You have Insufficent Balance..!!");
	}
	
}
public class Bank {
	public static void main(String[] args) {
		System.out.println("=============Savaing Account Details==============\n");
		SavingAccount savingAccount=new SavingAccount("SBI9955", 50000.0);
		System.out.println("Account Number: "+savingAccount.getAcocuntNumber());
		System.out.println("Initial Balalance: "+savingAccount.getBalance());
		
		System.out.println("Depositing Amount 550.0");
		savingAccount.deposit(550.0);
		System.out.println("Balance after depositing Amount: "+savingAccount.getBalance());
		System.out.println("Withdrawl Amount 1020.0");
		savingAccount.withdrawl(1020.0);
		System.out.println("Balance After Withdrawl: "+savingAccount.getAcocuntNumber());
		
		System.out.println("\n=================Current Account Details==============\n");
		CurrentAccount currentAccount=new CurrentAccount("Kotak9877", 750000.0);
		System.out.println("Account Number: "+currentAccount.getAcocuntNumber());
		System.out.println("Initial Balalance: "+currentAccount.getBalance());
		
		System.out.println("Depositing Amount 550.0");
		currentAccount.deposit(550.0);
		System.out.println("Balance after depositing Amount: "+currentAccount.getBalance());
		System.out.println("Withdrawl Amount 1020.0");
		currentAccount.withdrawl(1020.0);
		System.out.println("Balance After Withdrawl: "+currentAccount.getAcocuntNumber());
		
	}
}

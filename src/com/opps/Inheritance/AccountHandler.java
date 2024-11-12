package com.opps.Inheritance;
/*Write a Java program to create a class known as "BankAccount" with methods called 
 * deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the 
 * withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 */
class BankAccount{
	private String  AccountNumber;
	private double Balance;
	public BankAccount(String number,double Balance) {
		this.AccountNumber=number;
		this.Balance=Balance;
	}
	void deposit(double amount) {
		Balance +=amount;
	}
	void withdrawl(double amount) {
		if(Balance>=amount) {
			Balance -=amount;
		}else {
			System.out.println("Insufficent Balance..!!");
		}
	}
	public double getBalance() {
		return Balance;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
}
class SavingsAccount extends BankAccount{
	
	public SavingsAccount(String number, double Balance) {
		super(number, Balance);
	}

	void withdrawl(double amount) {
		if(getBalance()-amount<100) {
			System.out.println("Mininum balance of 100 required..!!");
		}else {
			super.withdrawl(amount);
		}
	}
}
public class AccountHandler {
	public static void main(String[] args) {
		System.out.println("Create a Bank Account object (A/c No. SBI1234) with initial balance of 500.0:");
		BankAccount SBI1234=new BankAccount("SBI1234", 500.0);
		System.out.println("Deposit 1000 into account SBI1234:");
		SBI1234.deposit(1000);
		System.out.println("New Balance after after depositing 1000: "+SBI1234.getBalance());
		System.out.println("Withdrowl 800 from  SBI1234	");
		SBI1234.withdrawl(800.0);
		System.out.println("New Balance after after withdrowl 800: "+SBI1234.getBalance());
		System.out.println("\nCreate a SavingsAccount object (A/c No. KOTAK1234) with initial balance of 1050:");
		BankAccount KOTAK1234=new BankAccount("KOTAK1234", 1050.0);
		KOTAK1234.withdrawl(550.0);
		System.out.println("Account Number: "+KOTAK1234.getAccountNumber());
		System.out.println("Balance After trying withdrowl 550.0: "+KOTAK1234.getBalance());
	}
}

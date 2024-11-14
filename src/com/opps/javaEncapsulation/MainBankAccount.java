package com.opps.javaEncapsulation;

public class MainBankAccount {
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		bankAccount.setAccountNumber("Sbi34567");
		bankAccount.setBalance(567987.0);
		System.out.println("Account Number: "+bankAccount.getAccountNumber());
		System.out.println("Balance: "+bankAccount.getBalance());
	}
}

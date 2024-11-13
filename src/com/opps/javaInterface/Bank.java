package com.opps.javaInterface;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;
	public Bank() {
		accounts=new ArrayList<Account>();
	}
	public void addAccount(Account account) {
		accounts.add(account);
	}
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	public void deposit(Account account,double amount) {
		account.deposit(amount);
	}
	public void withdrowl(Account account,double amount) {
		account.withdrowl(amount);
	}
	public double accountBalance(Account account) {
		return account.getBalance();
	}
	public String accountNumber(Account account) {
		return account.getAccountNumber();
	}
	public void accountInterest(Account account) {
		 account.calculateInterest();
	}
}

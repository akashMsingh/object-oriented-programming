package com.opps.staticMember;
/*Write a Java program to create a class called "BankAccount" with instance variables 
 * 'accountNumber' and balance, and static variables 'bankName' and 'interestRate'. 
 * Provide static methods to get and set the static variables. 
 * Create several 'BankAccount' objects and print their details
 *  along with the static variables.
 */
public class BankAccount {
	private String accountNumber;
	private double balance;
	private static String bankName;
	private static double interestRate;
	
	public BankAccount(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		BankAccount.bankName = bankName;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		BankAccount.interestRate = interestRate;
	}
	public void printDetail() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("BankName: "+bankName);
		System.out.println("Interest Rate: "+interestRate+"%");
	}
	public static void main(String[] args) {
//		BankAccount.bankName="SBI";
//		BankAccount.interestRate=3.5;
		BankAccount.setBankName("KotakMahindra");
		BankAccount.setInterestRate(2.5);
		
		BankAccount b1=new BankAccount("987655488", 5000.0);
		BankAccount b2=new BankAccount("887766555", 555.05);
		
		b1.printDetail();
		System.out.println();
		b2.printDetail();
	}
}

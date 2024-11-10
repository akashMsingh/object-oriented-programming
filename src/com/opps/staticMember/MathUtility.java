package com.opps.staticMember;

import java.util.Scanner;

/*Write a Java program to create a class called "MathUtility" with a static method 
 * add that takes two integers and returns their sum. Demonstrate the usage of this
 *  static method in the main method without creating an instance of "MathUtility".
 */
public class MathUtility {
	static int add(int n1,int n2) {
		return n1+n2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1 and n2:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=MathUtility.add(n1, n2);
		System.out.println("Sum: "+sum);
		sc.close();
	}
}

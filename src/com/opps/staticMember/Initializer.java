package com.opps.staticMember;
/*Write a Java program to create a class called "Initializer" with a static block 
 * that initializes a static variable 'initialValue' to 1000. 
 * Print the value of 'initialValue' before and after creating an instance of "Initializer".
 */
public class Initializer {
	static int initialValue;
	static {
		initialValue=1000;
		System.out.println("Static block executed: initialized initialValue");
	}
	public static void main(String[] args) {
		System.out.println("Before Creation of instance: initialValue "+Initializer.initialValue);
		new Initializer();
		System.out.println("After creation of instance: initialValue "+Initializer.initialValue);
	}
}

package com.opps.staticMember;
/*Write a Java program to create a class called "ComplexInitializer" with a static block 
 * that initializes multiple static variables (x, y, z) using complex logic. 
 * Print the values of these variables in the main method.*/
public class ComplexInitializer {
	public static int x;
	public static int y;
	public static int z;
	static {
		x=10;
		y=20;
		z=calculate(y, x);
	}
	private static int calculate(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		System.out.println("Value of z: "+z);
	}
}

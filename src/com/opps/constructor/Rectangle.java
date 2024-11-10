package com.opps.constructor;
/*Write a Java program to create a class called Rectangle with instance variables
 *  length and width. Implement a parameterized constructor and a copy constructor 
 *  that initializes a new object using the values of an existing object. 
 *  Print the values of the variables..*/
public class Rectangle {
	private double length;
	private double width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	// Copy constructor
	public Rectangle(Rectangle rectangle) {
		this.length=rectangle.length;
		this.width=rectangle.width;
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5.0, 10.0);
		System.out.println("Length of rectangle is "+r1.length);
		System.out.println("Width of rectangle is "+r1.width);
		
		System.out.println("==============================");
		Rectangle r2=new Rectangle(r1);
		System.out.println("Length of rectangle is "+r2.length);
		System.out.println("Width of rectangle is "+r2.width);
	}
}

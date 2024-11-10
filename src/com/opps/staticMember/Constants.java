package com.opps.staticMember;
/*Write a Java program to create a class called Constants with a static final variable 
 * 'PI' initialized to 3.14159. Create a method to calculate the area of a circle given
 *  its radius, using the 'PI' constant. Demonstrate the method in the main method.
 */
public class Constants {
	static final double PI=3.14159;
	static double calculate(double r) {
		return PI*r*r;
	}
	public static void main(String[] args) {
		double radius=10.0;
		double area=Constants.calculate(radius);
		System.out.println("Area of Circle: "+area);
	}
}

package com.opps.Inheritance;
/*Write a Java program to create a class called Vehicle with a method called drive().
 *  Create a subclass called Car that overrides the drive() method to print "Repairing a car".
 */
class Vehical{
	void drive() {
		System.out.println("Driving..");
	}
}
class Car extends Vehical{
	void drive() {
		System.out.println("Repairing..!!");
	}
}
public class VehicalRunner {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.drive();
	}
}

package com.opps.nestedClasses;

/*Write a Java program to create an interface called Greeting with a method sayHello(). 
 * In the main method, create an anonymous class that implements the Greeting interface
 * and override the sayHello() method to print " Hello, World!". Call the sayHello() method.
*/
public class Main {
	public static void main(String[] args) {
		// Creating an anonymous class that implements the Greeting interface
		Greeting g1=new Greeting() {
			public void sayHello() {
				System.out.println("Hello,World");
			}
		};
		// Calling the sayHello method of the anonymous class
		g1.sayHello();
	}
}

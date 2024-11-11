package com.opps.nestedClasses;

/*Write a Java program to create an outer class called  Computer with an inner class  Processor.
 *  The Processor class should have a method "displayDetails()" that prints the details
 *   of the processor (e.g., brand and speed). Create an instance of Processor
 *    from the Computer class and call the "displayDetails()" method.
 */

public class Computer {
	 class Processor {
		void displayDetails() {
			System.out.println("Processor Brand: Intel");
            System.out.println("Processor Speed: 3.5 GHz");
		}
	}
	void instanceCreation() {
		Processor p1=new Processor();
		p1.displayDetails();
	}
	public static void main(String[] args) {
		Computer c1 =new Computer();
		c1.instanceCreation();
		
		System.out.println("=============We can also call this Way==============");
		Computer.Processor p2=c1.new Processor();
		p2.displayDetails();
		
	}
}

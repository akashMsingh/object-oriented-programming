package com.opps.constructor;
/*Write a Java program to create a class called Car with instance variables
 *  make, model, and year. Implement a parameterized constructor that initializes
 *   these variables and assigns default values if not provided.
 *    Print the values of the variables.
*/
public class Car {
	private String make;
	private String model;
	private	int year;
	public Car(String make,String model,int year) {
		this.make=(make==null||make.isEmpty())?"Unknown make":make;
		this.model=(model==null||model.isEmpty())?"Unknown model":model;
		this.year=(year<=0)?2000:year;
	}
	public static void main(String[] args) {
		Car c1=new Car("BMW", "2 Series", 2024);
		System.out.println("Make By: "+c1.make);
		System.out.println("Model : "+c1.model);
		System.out.println("year: "+c1.year);
		
		System.out.println("==========================");
		//Testing of Default values
		Car c2=new Car(null, null, 0);
		System.out.println("Make By: "+c2.make);
		System.out.println("Model : "+c2.model);
		System.out.println("year: "+c2.year);
	}
}

package com.opps.staticMember;
/*Write a Java program to create a class called "IDGenerator" with a static variable 
 * 'nextID' and a static method "generateID()" that returns the next ID and increments
 *  'nextID'. Demonstrate the usage of generateID in the main method.*/
public class IDgenerator {
	public static int nextID=1;
	static int generateID() {
		return nextID++;
	}
	public static void main(String[] args) {
		System.out.println("Generate ID: "+IDgenerator.generateID());
		System.out.println("Generate ID: "+IDgenerator.generateID());
		System.out.println("Generate ID: "+IDgenerator.generateID());
	}
}

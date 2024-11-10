package com.opps.constructor;
/*Write a Java program to create a class called Singleton that ensures 
 * only one instance of the class can be created. Implement a private constructor 
 * and a public static method to get the single instance of the class. 
 * Print a message indicating the creation of the instance.*/
public class SingleTon {
	private static SingleTon singleInstance=null;
	
	private SingleTon() {
		System.out.println("SingleTon instance created.");
	}
	public static SingleTon getInstance() {
		if(singleInstance==null) {
			singleInstance=new SingleTon();
		}
		return singleInstance;
	}
	public static void main(String[] args) {
		//Get single instance of SingleTon 
		SingleTon instance1=singleInstance.getInstance();
		//Get another instance of SingleTon
		SingleTon instance2=singleInstance.getInstance();
		if(instance1==instance2) {
			System.out.println("Both instance are same");
		}else {
			System.out.println("Instances are difference");
		}
	}
}

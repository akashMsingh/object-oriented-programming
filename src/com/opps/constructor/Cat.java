package com.opps.constructor;
/* Write a Java program to create a class called "Cat" with instance 
 * variables name and age. Implement a default constructor that initializes 
 * the name to "Unknown" and the age to 0. Print the values of the variables.*/
public class Cat {
	private String name;
	private int age;
	public Cat() {
		this.name="Unkonwn";
		this.age=0;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Cat c1=new Cat();
		System.out.println("Cat's Name: "+c1.getName());
		System.out.println("Cat's Age: "+c1.getAge());
	}
}

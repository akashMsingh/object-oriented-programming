package com.opps.constructor;
/* Write a Java program to create a class called Dog with instance variables 
 * name and color. Implement a parameterized constructor that takes name and color
 * as parameters and initializes the instance variables. Print the values of the
 * variables.*/ 
public class Dog {
	private String name;
	private String color;
	public Dog(String name,String color) {
		this.name=name;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public static void main(String[] args) {
		Dog d1=new Dog("Tommy", "White");
		System.out.println("Dog's Name: "+d1.getName());
		System.out.println("Dog's Age: "+d1.getColor());
	}
}

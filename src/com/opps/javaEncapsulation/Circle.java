package com.opps.javaEncapsulation;
/* Write a Java program to create a class called Circle with a private instance variable radius. 
 * Provide public getter and setter methods to access and modify the radius variable. 
 * However, provide two methods called calculateArea() and calculatePerimeter() that return the 
 * calculated area and perimeter based on the current radius value.*/
public class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	public double calculateParimeter() {
		return 2*Math.PI*radius;
	}
}

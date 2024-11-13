package com.opps.javaInterface;

/*Write a Java program to create an interface Shape with the getArea() method. 
 * Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
 * Implement the getArea() method for each of the three classes.
 */
public interface Shape {
	double getArea();
}
class Rectangle implements Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public double getArea() {
		return length * width;
	}
}
class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {

		return Math.PI * radius * radius;
	}
}
class Tringle implements Shape {
	private double side1;
	private double side2;
	private double side3;
	public Tringle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}

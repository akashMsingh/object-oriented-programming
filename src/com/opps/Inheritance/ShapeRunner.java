package com.opps.Inheritance;
/*Write a Java program to create a class called Shape with a method called getArea(). 
 * Create a subclass called Rectangle that overrides the getArea() method to calculate 
 * the area of a rectangle.
 */

class Shape{
	void getArea() {
		System.out.println("Area..!!");
	}
}
class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	void getArea() {
		System.out.println("Area of Rectangle: "+(length*width));
	}
}
public class ShapeRunner {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(10.0, 20.0);
		r1.getArea();
	}
}

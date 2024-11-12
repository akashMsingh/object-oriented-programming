package com.opps.abstractClasses;
/*Write a Java program to create an abstract class Shape with abstract methods calculateArea() 
 * and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape 
 * class and implement the respective methods to calculate the area and perimeter of each shape.
 */

abstract class Shape{
	abstract double calculateArea();
	abstract double calculateParameter();
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	double calculateParameter() {
		return 2*Math.PI*radius;
	}
}
class Tringle extends Shape{
	private double side1;
	private double side2;
	private double side3;
	public Tringle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	double calculateArea() {
		double s=(side1+side2+side3)/2;
		
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	@Override
	double calculateParameter() {
		return side1+side2+side3;
	}
	
}
public class MainShape {
	public static void main(String[] args) {
		Circle c1=new Circle(3.5);
		System.out.println("Area of Circle: "+c1.calculateArea());
		System.out.println("Parameter of Circle: "+c1.calculateParameter());
		
		System.out.println();
		System.out.println("===================");
		System.out.println();
		
		Tringle t1=new Tringle(10, 6, 9);
		System.out.println("Area of Tingle: "+t1.calculateArea());
		System.out.println("Parameter of Tringle: "+t1.calculateParameter());
	}
}

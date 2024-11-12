package com.opps.Inheritance;
/*Write a Java program to create a class called Shape with methods called getPerimeter() 
 * and getArea(). Create a subclass called Circle that overrides the getPerimeter() 
 * and getArea() methods to calculate the area and perimeter of a circle.
 */
class Shap{
	public double getParameter() {
		return 0.0;
	}
	public double getArea() {
		return 0.0;
	}
}
class Circle{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getParameter() {
		return 2*Math.PI*radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
public class MainShape {
	public static void main(String[] args) {
		double r=20.0;
		Circle c1=new Circle(r);
		System.out.println("Radius of Circle: "+r);
		System.out.println("Parameter of Circle: "+c1.getParameter());
		System.out.println("Radius of Cirle: "+c1.getArea());
		
		System.out.println();
		System.out.println("====================");
		System.out.println();
		
		r=9.0;
		Circle c2=new Circle(r);
		System.out.println("Radius of Circle: "+r);
		System.out.println("Parameter of Circle: "+c2.getParameter());
		System.out.println("Radius of Circle: "+c2.getArea());
	}
}

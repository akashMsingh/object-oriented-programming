package com.opps.abstractClasses;
/*Write a Java program to create an abstract class GeometricShape with abstract methods area() 
 * and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class 
 * and implement the respective methods to calculate the area and perimeter of each shape.
 */
public class Main {
	public static void main(String[] args) {
		Tringle1 t1=new Tringle1(10, 9, 6);
		System.out.println("Area of Tringle: "+t1.area());
		System.out.println("Parimenter Of Tringle: "+t1.parameter());
		
		System.out.println("======================");
		
		Square s1=new Square(10);
		System.out.println("Area of Square: "+s1.area());
		System.out.println("Parimeter of Tringle: "+s1.parameter());
	}
}

package com.opps.constructor;
/*Write a Java program to create a class called Point with instance variables x and y.
 *  Implement overloaded constructors:
 *  
 *  One constructor takes int parameters.
 *  Another constructor takes double parameters.
 *  Print the values of the variables for each constructor.*/

public class Point {
	private double x;
	private double y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public void printPoint() {
		System.out.println("Point(x,y)="+"("+x+","+y+")");
	}
	public static void main(String[] args) {
		//Testing with Integer value
		Point p1=new Point(10, 20);
		p1.printPoint();
		
		System.out.println("============================");
		
		//Testing with Double Value
		Point p2=new Point(50.0, 100.0);
		p2.printPoint();
	}
}

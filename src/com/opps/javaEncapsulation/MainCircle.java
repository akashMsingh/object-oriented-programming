package com.opps.javaEncapsulation;

public class MainCircle {
	public static void main(String[] args) {
		Circle circle=new Circle();
		//set the data for private variable
		circle.setRadius(7.0);
		
		System.out.println("Radius of Circle: "+circle.getRadius());
		System.out.println("Area of Circle: "+circle.calculateArea());
		System.out.println("Parimeter of Circle: "+circle.calculateParimeter());
		
	}
}

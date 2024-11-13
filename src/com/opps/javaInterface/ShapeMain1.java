package com.opps.javaInterface;

public class ShapeMain1 {
	public static void main(String[] args) {
		//To Achieve abstraction
		Shape shape;//Interface type reference variable 
		shape=new Rectangle(10.0, 20.0);//Assign in implementation class object on interface type ref(upcasting)
		System.out.println("Area of Rectangle: "+shape.getArea());
		
		shape=new Circle(3.0);//Assign in implementation class object on interface type ref(upcasting)
		System.out.println("Area of Cirlce: "+shape.getArea());
		
		shape=new Tringle(10, 20, 30);//Assign in implementation class object on interface type ref(upcasting)
		System.out.println("Area of Tringle: "+shape.getArea());
	}
}

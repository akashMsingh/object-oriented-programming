package com.opps.abstractClasses;


public abstract class GeometricShape {
	public abstract double area();
	public abstract double parameter();
}
class Tringle1 extends GeometricShape{
	private double side1;
	private double side2;
	private double side3;
	public Tringle1(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	public double area() {
		double s=(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	@Override
	public double parameter() {
		return side1+side2+side3;
	}
}
class Square extends GeometricShape{
	private double side;
	public Square(double side) {
		this.side=side;
	}
	@Override
	public double area() {
		return side*side;
	}
	@Override
	public double parameter() {
		return 4*side;
	}
}

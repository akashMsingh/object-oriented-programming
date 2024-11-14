package com.opps.javaEncapsulation;

public class MainRectangle {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(20.0);
		rectangle.setWidth(50.0);
		System.out.println("Length: "+rectangle.getLength());
		System.out.println("Width: "+rectangle.getWidth());
	}
}

package com.opps.javaInterface;

public class MainResize {
	public static void main(String[] args) {
		Rectangle1 r1=new Rectangle1(10, 20);
		r1.printSize();
		System.out.println("===========After Resize===========");
		r1.resizeHeight(100);
		r1.resizeWidth(200);
		r1.printSize();
	}
}

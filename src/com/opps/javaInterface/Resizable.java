package com.opps.javaInterface;

public interface Resizable {
	void resizeWidth(int width);
	void resizeHeight(int height);
}
class Rectangle1 implements Resizable{
	private int width;
	private int height;
	public Rectangle1(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void resizeWidth(int width) {
		this.width=width;
	}
	@Override
	public void resizeHeight(int height) {
		this.height=height;
	}
	public void printSize() {
		System.out.println("Width: "+width+" Height: "+height);
	}
}

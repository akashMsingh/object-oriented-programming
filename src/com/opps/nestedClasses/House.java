package com.opps.nestedClasses;
/*Write a Java program to create a class called House with a method calculateArea(). 
 * Inside this method, define a local class Room with a method getArea() that calculates
 *  and returns the area of the room (length * width). 
 *  Instantiate the Room class and call the getArea() method from within calculateArea().
 */
public class House {
	public void  calculateArea(int length,int width) {
		class Room{
			public int getArea() {
				return length*width;
			}
		}
		Room r1=new Room();
		System.out.println("Area: "+r1.getArea());
		
	}
	public static void main(String[] args) {
		House house=new House();
		house.calculateArea(10, 20);
	}
}

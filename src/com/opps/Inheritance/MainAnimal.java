package com.opps.Inheritance;
/*Write a Java program to create a class called Animal with a method named move(). 
 * Create a subclass called Cheetah that overrides the move() method to run.
 */

class AnimalClass{
	void move() {
		System.out.println("Animal Move..!!");
	}
}
class Cheetah extends AnimalClass{
	void move() {
		System.out.println("Cheetah is running..!!");
	}
}
public class MainAnimal {
	public static void main(String[] args) {
		AnimalClass ac=new AnimalClass();
		ac.move();
		
		System.out.println("===========================");
		Cheetah c1=new Cheetah();
		c1.move();
	}
}

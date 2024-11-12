package com.opps.abstractClasses;
/* Write a Java program to create an abstract class Animal with an abstract method called 
 * sound(). Create subclasses Lion and Tiger that extend the Animal class and implement 
 * the sound() method to make a specific sound for each animal.
 */
abstract class  Animal1{
	abstract void sound();
}
class Lion extends Animal1{
	public void sound() {
		System.out.println("Lion sound..!!");
	}
}
class Tiger extends Animal1{
	public void sound() {
		System.out.println("Tiger Sound..!!");
	}
}
public class MainAnimal{
	public static void main(String[] args) {
		Tiger t1=new Tiger();
		t1.sound();
		System.out.println("=========================");
		Lion l1=new Lion();
		l1.sound();
	}
}

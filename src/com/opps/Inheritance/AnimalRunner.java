package com.opps.Inheritance;
/*Write a Java program to create a class called Animal with a method called makeSound().
 *  Create a subclass called Cat that overrides the makeSound() method to bark.
 */
 class Animal {
	void makeSound() {
		System.out.println("Animal Sound");
	}
}
class cat extends AnimalRunner{
	void makeSound() {
		System.out.println("Meow..!!");
	}
}
public class AnimalRunner{
	public static void main(String[] args) {
		Animal an=new Animal();
		an.makeSound();
		cat c=new cat();
		c.makeSound();
	}
}

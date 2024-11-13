package com.opps.javaInterface;

/*Write a Java program to create an interface Flyable with a method called fly_obj(). 
 * Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. 
 * Implement the fly_obj() method for each of the three classes.
 */
public interface Flyable {
	void fly_obj();
}
class Spacecraft implements Flyable {
	@Override
	public void fly_obj() {
		System.out.println("Spacecraft is flying..!");
	}
}
class Airplane implements Flyable {
	@Override
	public void fly_obj() {
		System.out.println("Airplane is flying...!");
	}
}
class Helicapter implements Flyable {
	@Override
	public void fly_obj() {
		System.out.println("Helicapter is flying..!");
	}
}

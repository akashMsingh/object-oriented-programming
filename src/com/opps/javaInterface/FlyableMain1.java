package com.opps.javaInterface;

public class FlyableMain1 {
	public static void main(String[] args) {
        // Create an array of Flyable objects, including a Spacecraft, Airplane, and Helicopter
		Flyable[] flying= {new Spacecraft(),new Airplane(), new Helicapter()};
		// Iterate through the array and call the "fly_obj" method on each object
		for(Flyable fly:flying) {
			fly.fly_obj();
		}
	}
}

package com.opps.javaInterface;
/*Write a Java program to create an interface Playable with a method play() that takes no arguments 
 * and returns void. Create three classes Football, Volleyball, and Basketball that implement the 
 * Playable interface and override the play() method to play the respective sports.

*/
public interface Playable {
	 void play();
}
class Football implements Playable{
	@Override
	public void play() {
		System.out.println("Playing Football..!!");
	}
}
class Volleyball implements Playable{
	@Override
	public void play() {
		System.out.println("Playing Volleyball...!");
	}
}
class Basketball implements Playable{
	@Override
	public void play() {
		System.out.println("Playing Basketball..!!");
	}
}
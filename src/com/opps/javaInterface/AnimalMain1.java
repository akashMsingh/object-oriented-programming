package com.opps.javaInterface;

public class AnimalMain1 {
	public static void main(String[] args) {
		//To Achieve abstraction
		Animal an;//Interface type reference variable 
		an=new Dog();//Assign in implementation class object on interface type ref(upcasting)
		an.bark();
	}
}

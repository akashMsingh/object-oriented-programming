package com.opps.javaEncapsulation;

public class MainSmartPhone {
	public static void main(String[] args) {
		Smartphone smartphone=new Smartphone();
		//set the data for instance variable 
		smartphone.setBrand("Samsung");
		smartphone.setModel("S23 Ultra");
		smartphone.setStorageCapacity(128);
		//Increasing the storage capacity
		smartphone.increaseStorage(128);
		
		System.out.println("Brand: "+smartphone.getBrand());
		System.out.println("Model: "+smartphone.getModel());
		System.out.println("Storage Capacity: "+smartphone.getStorageCapacity()+"GB");
	}
}

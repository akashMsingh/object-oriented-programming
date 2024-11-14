package com.opps.javaEncapsulation;

public class MainDesktop {
	public static void main(String[] args) {
		Desktop desktop=new Desktop();
		//Set the data for private variable
		desktop.setBrand("Dell");
		desktop.setProcessor("Core i3");
		desktop.setRamSize(4);
		
		//Increasing the ram Size
		desktop.upgradeRam(4);
		System.out.println("Brand: "+desktop.getBrand());
		System.out.println("Processor: "+desktop.getProcessor());
		System.out.println("RAM Size: "+desktop.getRamSize());
	}
}

package com.opps.javaEncapsulation;
/*Write a Java program to create a class called Desktop with private instance variables brand, 
 * processor, and ramSize. Provide public getter and setter methods to access and modify these 
 * variables. Add a method called upgradeRam() that takes an integer value and increases 
 * the ramSize by that value
 */
public class Desktop {
	private String brand;
	private String processor;
	private int ramSize;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public void upgradeRam(int ram) {
		ramSize+=ram;
	}
}

package com.opps.javaEncapsulation;

public class MainCar {
	public static void main(String[] args) {
		Car car=new Car();
		//Set the value for private variable
		car.setCompany_name("TATA");
		car.setModel_name("Naino");
		car.setYear(2014);
		
		System.out.println("Company Name: "+car.getCompany_name());
		System.out.println("Model Name: "+car.getModel_name());
		System.out.println("Year: "+car.getYear());
		System.out.println("Mileage: "+car.getMilege());
	}
}

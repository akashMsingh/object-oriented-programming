package com.opps.javaEncapsulation;

public class MainPerson {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("Akash");
		p1.setAge(23);
		p1.setCountry("India");
		
		System.out.println("Name: "+p1.getName());
		System.out.println("Age: "+p1.getAge());
		System.out.println("Country: "+p1.getCountry());
	}
}

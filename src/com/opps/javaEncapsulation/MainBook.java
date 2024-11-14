package com.opps.javaEncapsulation;

public class MainBook {
	public static void main(String[] args) {
		Book book=new Book();
		
		book.setTitle("Java Progromming");
		book.setAuthor("Yaswant Khanetkar");
		book.setPrice(50);
		
		book.applyDiscount(10);
		
		System.out.println("Title: "+book.getTitle());
		System.out.println("Auther: "+book.getAuthor());
		System.out.println("Price: "+book.getPrice());
	}
}

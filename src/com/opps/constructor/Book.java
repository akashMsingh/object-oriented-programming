package com.opps.constructor;
/*Write a Java program to create a class called "Book" with instance variables title,
 *  author, and price. Implement a default constructor and two parameterized 
 *  constructors:
 *One constructor takes title and author as parameters.
 *The other constructor takes title, author, and price as parameters.
 *Print the values of the variables for each constructor.
*/
public class Book {
	String title;
	String author;
	double price;
	public Book() {
		this.title="Shrimad bhagwat geeta";
		this.author="Shri Krishna";
		this.price=0.0;
	}
	public Book(String title,String author) {
		this.author=author;
		this.title=title;
	}
	public Book(String title,String author,double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public static void main(String[] args) {
		Book b1=new Book();
		Book b2=new Book("Mahabharat", "Ved Vyasa");
		Book b3=new Book("Ramayana", "Valmiki", 500.0);
		System.out.println("Book: "+b1.title+" Author is "+b1.author+" Price "+b1.price);
		System.out.println("Book: "+b2.title+" Author is "+b2.author);
		System.out.println("Book: "+b3.title+" Author is "+b3.author+" Price "+b3.price);
	}
}

package com.opps.nestedClasses;
/*Write a Java program to create an outer class called Library with an instance variable 
 * libraryName. Create an inner class Book with a method getLibraryName() 
 * that returns the name of the library. 
 * Instantiate the Book class and call the getLibraryName() method.
 */
public class Library {
	private String libraryName;
	public Library(String name) {
		this.libraryName=name;
	}
	class Book{
		public String getLibraryName() {
			return libraryName;
		}
	}
	public static void main(String[] args) {
		Library library=new Library("Central Library");
		Library.Book book=library.new Book();
		String libraryName=book.getLibraryName();
		System.out.println("Library Name: "+libraryName);
	}
}

package com.opps.constructor;
/*Write a Java program to create a class called Classroom with instance variables 
 * className and students (an array of strings).
 *  Implement a parameterized constructor that initializes these variables.
 *  Print the values of the variables.*/
public class ClassRoom {
	private String className;
	private String[] students;
	
	public ClassRoom(String className,String[]students) {
		this.className=className;
		this.students=students;
	}
	public void printClassRoom() {
		System.out.println("ClassName is: "+className);
		System.out.println("Student are...");
		for(String student:students) {
			System.out.print(student+",");
		}
	}
	public static void main(String[] args) {
		//Creating a Array of Student name
		String[] studentName= {"Akash","Vishal","Diwakar","Sudhakar","Prince","Price"};
		ClassRoom c1=new ClassRoom("Phychology", studentName);
		c1.printClassRoom();
	}
}

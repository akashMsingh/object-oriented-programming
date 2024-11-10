package com.opps.constructor;
/*Write a Java program to create a class called Student with instance 
 * variables studentId, studentName, and grade. 
 * Implement a default constructor and a parameterized constructor 
 * that takes all three instance variables. Use constructor chaining to 
 * initialize the variables. Print the values of the variables.*/
public class Student {
	private int studentId;
	private String studentName;
	private double grade;
	public Student() {
		this(1, "AkashKumarSingh", 67.0);
	}
	public Student(int studentId, String studentName, double grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.studentId);
		System.out.println(s1.studentName);
		System.out.println(s1.grade);
		
		System.out.println("===========================");
		
		Student s2=new Student(2, "VishalKuamrSingh", 90.0);
		System.out.println(s2.studentId);
		System.out.println(s2.studentName);
		System.out.println(s2.grade);
	}
}

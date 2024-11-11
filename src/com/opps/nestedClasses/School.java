package com.opps.nestedClasses;
/*Write a Java program to create an outer class called School with a static nested 
 * class Student.The Student class should have a non-static method displayStudentInfo() 
 * that prints the student's name and grade. Instantiate the Student class from the 
 * main method and call the displayStudentInfo() method.
 */
public class School {
	public static class Student{
		private String Sname;
		private double grade;
		public Student(String name,double grade) {
			this.Sname=name;
			this.grade=grade;
		}
		public void displayStudentInfo() {
			System.out.println("Student Name: "+Sname);
			System.out.println("Grade: "+grade+"%");
		}
	}
	public static void main(String[] args) {
		School.Student student=new School.Student("Allen",90.0);
		student.displayStudentInfo();
	}
}

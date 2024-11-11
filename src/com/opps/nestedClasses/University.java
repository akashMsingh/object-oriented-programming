package com.opps.nestedClasses;

/*Write a Java program to create an outer class called University with a static nested 
 * class Department. The Department class should have a method "displayInfo()" that 
 * prints the department name and the number of faculty members. 
 * Instantiate the Department class from the main method and call the "displayInfo()" method.
 */

public class University {
	public static class Department{
		private String DepartmentName;
		private int FacultyMember;
		public Department(String name,int member) {
			this.DepartmentName=name;
			this.FacultyMember=member;
		}
		void displayInfo() {
			System.out.println("Department Name: "+DepartmentName);
			System.out.println("Number Of Faculty members: "+FacultyMember);
		}
	}
	public static void main(String[] args) {
		University.Department d1=new University.Department("Science", 20);
		d1.displayInfo();
	}
}

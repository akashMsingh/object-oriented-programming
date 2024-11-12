package com.opps.Inheritance;
/*Write a Java program to create a class called Employee with methods called work() 
 * and getSalary(). Create a subclass called HRManager that overrides the work() method 
 * and adds a new method called addEmployee().
 */

class Emp{
	private double salary;
	public Emp(double salary) {
		this.salary=salary;
	}
	void work() {
		System.out.println("Working...!!");
	}
	public double getSalary() {
		return salary;
	}
}
class HRManager extends Emp{
	public HRManager(double salary) {
		super(salary);
	}
	void work() {
		System.out.println("Managing employee work...!!");
	}
	void addEmployee() {
		System.out.println("Adding new employee..!!");
	}
}
public class EmployeeRunner {
	public static void main(String[] args) {
		HRManager hrManager=new HRManager(50000.0);
		Emp emp=new Emp(10000.0);
		System.out.println("Employee salary: "+emp.getSalary());
		emp.work();
		System.out.println("================================");
		System.out.println("HR Manager Salary: "+hrManager.getSalary());
		hrManager.work();
		hrManager.addEmployee();
	}
}

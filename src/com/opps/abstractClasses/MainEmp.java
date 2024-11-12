package com.opps.abstractClasses;
/*Write a Java program to create an abstract class Employee with abstract methods calculateSalary() 
 * and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and 
 * implement the respective methods to calculate salary and display information for each role.
 */
abstract class employ{
	private String name;
	private double baseSalary;
	public employ(String name,double baseSalary) {
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	public String getName() {
		return name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	abstract double calculateSalary();
	abstract void displayInfo();
}
class Manager extends employ{
	private double bonus;
	public Manager(String name, double baseSalary,double bonus) {
		super(name, baseSalary);
		this.bonus=bonus;
	}
	@Override
	double  calculateSalary() {
		return getBaseSalary()+bonus;
	}
	@Override
	void displayInfo() {
		System.out.println("Manager Name: "+getName());
		System.out.println("Base Salary: "+getBaseSalary());
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+calculateSalary());
	}
}
class Programmer extends employ{
	private int overTime;
	private double hourlyRate;
	public Programmer(String name, double baseSalary,int overTime,double hourlyRate) {
		super(name, baseSalary);
		this.overTime=overTime;
		this.hourlyRate=hourlyRate;
	}
	@Override
	double calculateSalary() {
		return getBaseSalary()+(overTime*hourlyRate);
	}
	@Override
	void displayInfo() {
		System.out.println("Programmer Name: "+getName());
		System.out.println("Base Salary: "+getBaseSalary());
		System.out.println("OverTime: "+overTime);
		System.out.println("Hourly Rate: "+hourlyRate);
		System.out.println("Total Salary: "+calculateSalary());
	}
	
}
public class MainEmp {
	public static void main(String[] args) {
		Manager manager=new Manager("Sonu Singh", 90000.0, 30000.0);
		manager.displayInfo();
		System.out.println();//For make separate
		Programmer programmer=new Programmer("Monu Singh", 50000.0, 3, 500.0);
		programmer.displayInfo();
		
	}
}

package com.opps.javaEncapsulation;

public class MainEmp {
	public static void main(String[] args) {
		Employee employee=new Employee();
		
		//Set the data for employee
		employee.setEmployee_id(1);
		employee.setEmployee_name("AkashKumar");
		employee.setEmployee_salary(55000.0);
		
		System.out.println("Employee Id: "+employee.getEmployee_id());
		System.out.println("Employee Name: "+employee.getEmployee_name());
		System.out.println("Emoloyee Salary:"+" "+employee.getEmployee_salary());
	}
}

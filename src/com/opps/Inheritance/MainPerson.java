package com.opps.Inheritance;
/*Write a Java program to create a class known as Person with methods called getFirstName() 
 *and getLastName(). Create a subclass called Employee that adds a new method named 
 *getEmployeeId() and overrides the getLastName() method to include the employee's job title.
 */

class Person{
	private String firstName;
	private String lastName;
	
	public Person(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
class Empl extends Person{
	private int Id;
	private String jobTitle; 
	
	public Empl(String firstName,String lastName,int Id,String jobTitle) {
		super(firstName,lastName);
		this.Id=Id;
		this.jobTitle=jobTitle;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getLastName() {
		return super.getLastName()+" "+jobTitle;
	}
	
}
public class MainPerson {
	public static void main(String[] args) {
		System.out.println("First Name\t\tLast Name\t\tID\t\tJob Title");
		Empl e1=new Empl("Akash","Kumar", 01, "SoftwareDevelper");
		System.out.println(e1.getFirstName()+"\t\t"+e1.getLastName()+"\t\t"+e1.getId()+"\t\t"+e1.getJobTitle());
		
		Empl e2=new Empl("Sudhakar", "Singh", 02, "SalesMan");
		System.out.println(e2.getFirstName()+"\t\t"+e2.getLastName()+"\t\t"+e2.getId()+"\t\t"+e2.getJobTitle());
	}
}

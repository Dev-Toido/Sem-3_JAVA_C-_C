package P6.Employee_System;

public class Employee {
	private int id;
    private String name;
    private int age;
	private double salary;
    public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
    }
	public void setName(int id,String name) {
		if(id==this.id)
			this.name = name;
		else
			System.out.println("Unauthorized Access!!!");
	}
	public void setAge(int id,int age) {
		if(id==this.id)
			this.age = age;
		else
			System.out.println("Unauthorized Access!!!");
	}
	public void setSalary(int id,double salary) {
		if(id==this.id)
			this.salary = salary;
		else
			System.out.println("Unauthorized Access!!!");
	}

	void display(int id) {
		if(id==this.id) {
			System.out.println("The Employee details are:");
			System.out.println("Id: " + this.id);
			System.out.println("Name: " + this.name);
			System.out.println("Age: " + this.age);
		}
		else{
			System.out.println("Unauthorized Access!!!");
		}
	}

}

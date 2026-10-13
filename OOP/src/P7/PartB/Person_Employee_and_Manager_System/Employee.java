package P7.PartB.Person_Employee_and_Manager_System;

class Employee extends Person {
	int employeeId;
	double salary;

	Employee(String name, int age, int employeeId, double salary) {
		super(name, age);
		this.employeeId = employeeId;
		this.salary = salary;
	}

	void work() {
		System.out.println(name + " is working as an employee.");
	}

	void displayEmployeeDetails() {
		displayPersonDetails();
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Salary: " + salary);
	}
}
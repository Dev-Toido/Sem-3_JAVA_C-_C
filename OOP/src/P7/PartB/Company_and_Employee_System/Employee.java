package P7.PartB.Company_and_Employee_System;

class Employee {
	int employeeId;
	String employeeName;
	String designation;
	double salary;

	Employee(int employeeId, String employeeName, String designation, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
	}

	void displayEmployeeDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}

	double calculateAnnualSalary() {
		return salary * 12;
	}

	void work() {
		System.out.println(employeeName + " is working.");
	}
}
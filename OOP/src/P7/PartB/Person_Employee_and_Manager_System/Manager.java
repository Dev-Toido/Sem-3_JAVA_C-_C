package P7.PartB.Person_Employee_and_Manager_System;

class Manager extends Employee {
	int teamSize;
	String department;

	Manager(String name, int age, int employeeId, double salary, int teamSize, String department) {
		super(name, age, employeeId, salary);
		this.teamSize = teamSize;
		this.department = department;
	}

	@Override
	void work() {
		System.out.println(name + " is managing the " + department + " team.");
	}

	void displayManagerDetails() {
		displayEmployeeDetails();
		System.out.println("Team Size: " + teamSize);
		System.out.println("Department: " + department);
	}
}
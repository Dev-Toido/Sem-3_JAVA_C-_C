package P7.PartB.Company_and_Employee_System;
import java.util.ArrayList;



class Company {
	String companyName;
	String location;
	ArrayList<Employee> employees = new ArrayList<>();

	Company(String companyName, String location) {
		this.companyName = companyName;
		this.location = location;
	}

	void addEmployee(Employee employee) {
		employees.add(employee);
	}

	void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	void displayEmployees() {
		System.out.println("Company: " + companyName);
		System.out.println("Location: " + location);
		System.out.println();

		for (Employee employee : employees) {
			employee.displayEmployeeDetails();
			System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
			employee.work();
			System.out.println();
		}
	}

	double calculateTotalSalary() {
		double total = 0;

		for (Employee employee : employees) {
			total += employee.salary;
		}

		return total;
	}
}


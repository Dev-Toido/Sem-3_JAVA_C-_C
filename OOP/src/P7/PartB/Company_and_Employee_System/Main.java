package P7.PartB.Company_and_Employee_System;
public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Vivek", "Developer", 50000);
		Employee e2 = new Employee(102, "Rahul", "Tester", 45000);
		Employee e3 = new Employee(103, "Amit", "Designer", 40000);
		Employee e4 = new Employee(104, "Neha", "Developer", 60000);
		Employee e5 = new Employee(105, "Priya", "Manager", 70000);

		Company c = new Company("Tech Solutions", "Ahmedabad");

		c.addEmployee(e1);
		c.addEmployee(e2);
		c.addEmployee(e3);
		c.addEmployee(e4);
		c.addEmployee(e5);

		c.displayEmployees();
		System.out.println("Total Salary: " + c.calculateTotalSalary());

		System.out.println("\nAfter Removing Employee:");
		c.removeEmployee(e3);

		c.displayEmployees();
		System.out.println("Updated Total Salary: " + c.calculateTotalSalary());
	}
}

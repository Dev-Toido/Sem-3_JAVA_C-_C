package P7.PartB.Person_Employee_and_Manager_System;
public class Main {
	public static void main(String[] args) {
		Employee e = new Employee("Rahul", 25, 101, 50000);
		Manager m = new Manager("Vivek", 22, 102, 80000, 10, "IT");

		e.displayEmployeeDetails();
		e.work();

		System.out.println();

		m.displayManagerDetails();
		m.work();
	}
}

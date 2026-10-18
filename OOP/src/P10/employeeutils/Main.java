package P10.employeeutils;


public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Vivek", "AI & ML", 65000);
		Employee e2 = new Employee(102, "Aisha", "HR", 52000);
		Employee e3 = new Employee(103, "Rahul", "Engineering", 72000);
		Employee e4 = new Employee(104, "Neha", "Finance", 60000);
		Employee e5 = new Employee(105, "Karan", "Marketing", 48000);
		Employee e6 = new Employee(101, "Vivek", "AI & ML", 65000);

		Employee[] employees = {e1, e2, e3, e4, e5};

		System.out.println("=== Testing toString() ===");
		System.out.println(e1);
		System.out.println(e2);

		System.out.println("\n=== Testing equals() ===");
		System.out.println("e1.equals(e6): " + e1.equals(e6));
		System.out.println("e1.equals(e2): " + e1.equals(e2));

		System.out.println("\n=== Testing hashCode() ===");
		System.out.println("e1.hashCode(): " + e1.hashCode());
		System.out.println("e6.hashCode(): " + e6.hashCode());

		System.out.println("\n=== Utility Methods ===");
		double average = EmployeeUtils.calculateAverageSalary(employees);
		System.out.println("Average Salary: " + average);

		Employee highest = EmployeeUtils.findHighestPaidEmployee(employees);
		System.out.println("Highest Paid Employee: " + highest);
	}
}

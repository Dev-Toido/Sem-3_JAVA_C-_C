package P7.PartA.Employee_Department;




public class Main {
	public static void main(String[] args) {
		Department d = new Department(10, "Computer Science");

		Employee e1 = new Employee(101, "Vivek", 50000, d);
		Employee e2 = new Employee(102, "Rahul", 55000, d);

		e1.showDetails();
		System.out.println();
		e2.showDetails();
	}
}
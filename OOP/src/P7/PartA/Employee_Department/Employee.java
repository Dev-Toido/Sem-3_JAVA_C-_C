package P7.PartA.Employee_Department;

class Employee {
	int empId;
	String empName;
	double salary;
	Department dept;

	Employee(int empId, String empName, double salary, Department dept) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}

	void showDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("Department ID: " + dept.deptId);
		System.out.println("Department Name: " + dept.deptName);
	}
}
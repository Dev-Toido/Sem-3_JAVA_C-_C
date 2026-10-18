package P10.employeeutils;

public class Employee {
	private int employeeId;
	private String name;
	private String department;
	private double salary;

	public Employee(int employeeId, String name, String department, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"employeeId=" + employeeId +
				", name='" + name + '\'' +
				", department='" + department + '\'' +
				", salary=" + salary +
				'}';
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Employee employee = (Employee) obj;
		return employeeId == employee.employeeId;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(employeeId);
	}
}


package P10.employeeutils;


public class EmployeeUtils {
	public static double calculateAverageSalary(Employee[] employees) {
		if (employees == null || employees.length == 0)
			return 0;

		double sum = 0;

		for (Employee employee : employees) {
			sum += employee.getSalary();
		}

		return sum / employees.length;
	}

	public static Employee findHighestPaidEmployee(Employee[] employees) {
		if (employees == null || employees.length == 0)
			return null;

		Employee highestPaid = employees[0];

		for (Employee employee : employees) {
			if (employee.getSalary() > highestPaid.getSalary()) {
				highestPaid = employee;
			}
		}

		return highestPaid;
	}
}

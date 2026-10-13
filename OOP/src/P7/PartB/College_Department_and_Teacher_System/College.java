package P7.PartB.College_Department_and_Teacher_System;

import java.util.ArrayList;

class College {
	String collegeName;
	String location;
	ArrayList<Department> departments = new ArrayList<>();

	College(String collegeName, String location) {
		this.collegeName = collegeName;
		this.location = location;
	}

	void addDepartment(Department department) {
		departments.add(department);
	}

	void displayDepartments() {
		System.out.println("College: " + collegeName);
		System.out.println("Location: " + location);
		System.out.println();

		for (Department department : departments) {
			department.displayTeachers();
			System.out.println();
		}
	}
}
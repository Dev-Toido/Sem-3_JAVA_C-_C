package P7.PartB.College_Department_and_Teacher_System;

import java.util.ArrayList;

class Department {
	int departmentId;
	String departmentName;
	ArrayList<Teacher> teachers = new ArrayList<>();

	Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	void conductClass(Teacher teacher) {
		System.out.println(departmentName + " is conducting a class.");
		teacher.teach();
	}

	void displayTeachers() {
		System.out.println("Department ID: " + departmentId);
		System.out.println("Department Name: " + departmentName);

		for (Teacher teacher : teachers) {
			teacher.displayTeacherDetails();
			System.out.println();
		}
	}
}
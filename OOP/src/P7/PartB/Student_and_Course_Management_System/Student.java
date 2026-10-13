package P7.PartB.Student_and_Course_Management_System;

import java.util.ArrayList;

class Student {
	int studentId;
	String studentName;
	String email;
	ArrayList<Course> courses = new ArrayList<>();

	Student(int studentId, String studentName, String email) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
	}

	void displayStudentDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Email: " + email);
	}

	void enrollCourse(Course course) {
		courses.add(course);
	}

	void displayEnrolledCourses() {
		for (Course course : courses) {
			course.displayCourseDetails();
			System.out.println();
		}
	}
}
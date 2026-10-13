package P7.PartB.Student_and_Course_Management_System;
class Course {
	int courseId;
	String courseName;
	int credits;

	Course(int courseId, String courseName, int credits) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.credits = credits;
	}

	void displayCourseDetails() {
		System.out.println("Course ID: " + courseId);
		System.out.println("Course Name: " + courseName);
		System.out.println("Credits: " + credits);
	}
}
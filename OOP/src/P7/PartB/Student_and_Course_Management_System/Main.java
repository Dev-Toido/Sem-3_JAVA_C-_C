package P7.PartB.Student_and_Course_Management_System;

public class Main {
	public static void main(String[] args) {
		Course c1 = new Course(101, "Java", 4);
		Course c2 = new Course(102, "DBMS", 3);
		Course c3 = new Course(103, "DSA", 4);

		Student s1 = new Student(1, "Vivek", "vivek@gmail.com");
		Student s2 = new Student(2, "Rahul", "rahul@gmail.com");

		s1.enrollCourse(c1);
		s1.enrollCourse(c2);

		s2.enrollCourse(c2);
		s2.enrollCourse(c3);

		s1.displayStudentDetails();
		System.out.println("Enrolled Courses:");
		s1.displayEnrolledCourses();

		s2.displayStudentDetails();
		System.out.println("Enrolled Courses:");
		s2.displayEnrolledCourses();
	}
}
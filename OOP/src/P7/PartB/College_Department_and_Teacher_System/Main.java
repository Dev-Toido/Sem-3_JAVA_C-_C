package P7.PartB.College_Department_and_Teacher_System;
public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher(101, "Dr. Sharma", "Java");
		Teacher t2 = new Teacher(102, "Dr. Patel", "DBMS");
		Teacher t3 = new Teacher(103, "Dr. Mehta", "DSA");

		Department d1 = new Department(1, "Computer Science");
		Department d2 = new Department(2, "Information Technology");

		d1.addTeacher(t1);
		d1.addTeacher(t2);
		d2.addTeacher(t3);

		College college = new College("Ganpat University", "Gujarat");

		college.addDepartment(d1);
		college.addDepartment(d2);

		college.displayDepartments();

		d1.conductClass(t1);
		t2.conductExam();
	}
}
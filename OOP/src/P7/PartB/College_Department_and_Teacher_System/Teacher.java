package P7.PartB.College_Department_and_Teacher_System;

class Teacher {
	int teacherId;
	String teacherName;
	String subject;

	Teacher(int teacherId, String teacherName, String subject) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subject = subject;
	}

	void teach() {
		System.out.println(teacherName + " is teaching " + subject);
	}

	void conductExam() {
		System.out.println(teacherName + " is conducting an exam for " + subject);
	}

	void displayTeacherDetails() {
		System.out.println("Teacher ID: " + teacherId);
		System.out.println("Teacher Name: " + teacherName);
		System.out.println("Subject: " + subject);
	}
}
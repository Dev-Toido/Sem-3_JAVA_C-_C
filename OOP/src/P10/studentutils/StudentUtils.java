package P10.studentutils;


public class StudentUtils {
	public static double calculateAverageMarks(Student[] students) {
		if (students == null || students.length == 0)
			return 0;

		double sum = 0;

		for (Student student : students) {
			sum += student.getMarks();
		}

		return sum / students.length;
	}

	public static Student findTopStudent(Student[] students) {
		if (students == null || students.length == 0)
			return null;

		Student topStudent = students[0];

		for (Student student : students) {
			if (student.getMarks() > topStudent.getMarks()) {
				topStudent = student;
			}
		}

		return topStudent;
	}
}
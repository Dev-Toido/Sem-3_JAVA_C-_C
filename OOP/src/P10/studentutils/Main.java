package P10.studentutils;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Alice", 95.5);
		Student s2 = new Student(2, "Bob", 87.0);
		Student s3 = new Student(3, "Charlie", 92.5);
		Student s4 = new Student(4, "Diana", 88.0);
		Student s5 = new Student(1, "Alice", 95.5);

		Student[] students = {s1, s2, s3, s4};

		System.out.println("=== Testing toString() ===");
		System.out.println(s1);
		System.out.println(s2);

		System.out.println("\n=== Testing equals() ===");
		System.out.println("s1.equals(s5): " + s1.equals(s5));
		System.out.println("s1.equals(s2): " + s1.equals(s2));

		System.out.println("\n=== Testing hashCode() ===");
		System.out.println("s1.hashCode(): " + s1.hashCode());
		System.out.println("s5.hashCode(): " + s5.hashCode());

		System.out.println("\n=== Utility Methods ===");
		double avg = StudentUtils.calculateAverageMarks(students);
		System.out.println("Average Marks: " + avg);

		Student top = StudentUtils.findTopStudent(students);
		System.out.println("Top Student: " + top);
	}
}
package P10.studentutils;

public class Student {
	private int id;
	private String name;
	private double marks;

	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + "', marks=" + marks + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Student student = (Student) obj;
		return id == student.id;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}
}
package P7.PartB.University_and_Professor_Management;

class Professor {
	int professorId;
	String name;
	String subject;
	double salary;

	Professor(int professorId, String name, String subject, double salary) {
		this.professorId = professorId;
		this.name = name;
		this.subject = subject;
		this.salary = salary;
	}

	void displayProfessorDetails() {
		System.out.println("Professor ID: " + professorId);
		System.out.println("Name: " + name);
		System.out.println("Subject: " + subject);
		System.out.println("Salary: " + salary);
	}

	void teach() {
		System.out.println(name + " is teaching " + subject);
	}
}
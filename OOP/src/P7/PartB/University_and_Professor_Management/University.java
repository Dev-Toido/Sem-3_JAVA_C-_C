package P7.PartB.University_and_Professor_Management;

import java.util.ArrayList;

class University {
	String universityName;
	String location;
	ArrayList<Professor> professors = new ArrayList<>();

	University(String universityName, String location) {
		this.universityName = universityName;
		this.location = location;
	}

	void addProfessor(Professor professor) {
		professors.add(professor);
	}

	void displayProfessors() {
		System.out.println("University: " + universityName);
		System.out.println("Location: " + location);
		System.out.println();

		for (Professor professor : professors) {
			professor.displayProfessorDetails();
			professor.teach();
			System.out.println();
		}
	}
}
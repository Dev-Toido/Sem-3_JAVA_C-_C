package P7.PartB.University_and_Professor_Management;

public class Main {
	public static void main(String[] args) {
		Professor p1 = new Professor(101, "Dr. Sharma", "Java", 80000);
		Professor p2 = new Professor(102, "Dr. Patel", "DBMS", 75000);

		University u = new University("Ganpat University", "Gujarat");

		u.addProfessor(p1);
		u.addProfessor(p2);

		u.displayProfessors();

		System.out.println("Professor can exist independently:");
		p1.displayProfessorDetails();
	}
}

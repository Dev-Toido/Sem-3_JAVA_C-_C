package P7.PartA.Student_Address;
public class Main {
	public static void main(String[] args) {
		Address a = new Address("Mehsana", "Gujarat", 384001);
		Student s = new Student(101, "Vivek", a);

		s.display();
	}
}

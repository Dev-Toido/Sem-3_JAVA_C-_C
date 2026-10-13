package P7.PartA.Hospital_Doctor;

public class Main {
	public static void main(String[] args) {
		Doctor d = new Doctor(101, "Dr. Sharma");
		Hospital h = new Hospital("City Hospital", d);

		h.display();
	}
}
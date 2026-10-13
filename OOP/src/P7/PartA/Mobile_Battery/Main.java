package P7.PartA.Mobile_Battery;

public class Main {
	public static void main(String[] args) {
		Battery b = new Battery(5000);
		Mobile m = new Mobile("Samsung", "Galaxy A55", b);

		m.display();
	}
}
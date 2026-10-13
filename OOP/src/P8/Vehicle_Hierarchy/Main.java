package P8.Vehicle_Hierarchy;

public class Main {
	public static void main(String[] args) {
		Vehicle v1 = new Car("Toyota", "Camry", 120);
		Vehicle v2 = new Bike("Honda", "CB350", 90);
		Vehicle v3 = new Bus("Volvo", "City Bus", 80);

		System.out.println("Car");
		v1.displayInfo();
		v1.start();

		System.out.println();

		System.out.println("Bike");
		v2.displayInfo();
		v2.start();

		System.out.println();

		System.out.println("Bus");
		v3.displayInfo();
		v3.start();
	}
}
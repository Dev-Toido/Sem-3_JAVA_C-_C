package P7.PartA.Car_Engine;
public class Main {
	public static void main(String[] args) {
		Engine e = new Engine("EN101", "Petrol", 150);
		Car c = new Car("Toyota", "Camry", 3500000, e);

		c.display();
	}
}

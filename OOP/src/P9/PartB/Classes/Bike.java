package P9.PartB.Classes;

public class Bike extends Vehicle {
	private String engineType;

	public Bike(String id, String brand, int speed, String engineType) {
		super(id, brand, speed);
		this.engineType = engineType;
	}

	@Override
	public void start() {
		System.out.println("Bike starts with self-start.");
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Engine Type: " + engineType);
	}
}
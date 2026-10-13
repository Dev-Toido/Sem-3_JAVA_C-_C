package P9.PartB.Classes;


public class Bus extends Vehicle {
	private int capacity;

	public Bus(String id, String brand, int speed, int capacity) {
		super(id, brand, speed);
		this.capacity = capacity;
	}

	@Override
	public void start() {
		System.out.println("Bus starts with ignition.");
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Capacity: " + capacity);
	}
}
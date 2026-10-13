package P9.PartB.Classes;

public class Car extends Vehicle {
	private int numDoors;

	public Car(String id, String brand, int speed, int numDoors) {
		super(id, brand, speed);
		this.numDoors = numDoors;
	}

	@Override
	public void start() {
		System.out.println("Car starts with key.");
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number of Doors: " + numDoors);
	}
}
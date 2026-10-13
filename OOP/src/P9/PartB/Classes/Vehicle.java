package P9.PartB.Classes;

public abstract class Vehicle {
	private String vehicleId;
	private String brand;
	private int speed;

	Vehicle(String vehicleId, String brand, int speed) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.speed = speed;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public String getBrand() {
		return brand;
	}

	public int getSpeed() {
		return speed;
	}

	public abstract void start();

	public void stop() {
		System.out.println(brand + " stopped.");
	}

	public void displayDetails() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed + " km/h");
	}
}
package P9.PartA.Vehicle_Management;

abstract class Vehicle {
	String number;
	String brand;

	Vehicle(String number, String brand) {
		this.number = number;
		this.brand = brand;
	}

	abstract void start();

	void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Number: " + number);
	}
}
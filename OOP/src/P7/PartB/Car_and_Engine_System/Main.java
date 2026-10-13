package P7.PartB.Car_and_Engine_System;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car("GJ01AB1234", "Toyota", "Fortuner", "EN101", "Diesel", 204);
		Car c2 = new Car("GJ01CD5678", "Honda", "City", "EN102", "Petrol", 119);

		c1.displayCarDetails();
		c1.displayEngineDetails();
		c1.startCar();
		c1.stopCar();

		System.out.println();

		c2.displayCarDetails();
		c2.displayEngineDetails();
		c2.startCar();
		c2.stopCar();
	}
}
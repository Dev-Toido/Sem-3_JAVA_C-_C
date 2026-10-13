package P9.PartA.Vehicle_Management;









public class Main {
	public static void main(String[] args) {
		Car car = new Car("GJ01AB1234", "Honda");

		car.displayDetails();
		car.start();
		car.service();

		System.out.println();

		Bike bike = new Bike("GJ01CD5678", "Yamaha");

		bike.displayDetails();
		bike.start();
		bike.service();
	}
}
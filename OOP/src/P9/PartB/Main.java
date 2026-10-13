package P9.PartB;

import P9.PartB.Classes.*;
import P9.PartB.Interfaces.Chargeable;
import P9.PartB.Interfaces.GPS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Vehicle> fleet = new ArrayList<>();
	static Scanner viv = new Scanner(System.in);

	static Vehicle findVehicle(String id) {
		for (Vehicle vehicle : fleet) {
			if (vehicle.getVehicleId().equalsIgnoreCase(id)) {
				return vehicle;
			}
		}
		return null;
	}

	static void addCar() {
		System.out.print("Vehicle ID: ");
		String id = viv.nextLine();

		System.out.print("Brand: ");
		String brand = viv.nextLine();

		System.out.print("Speed: ");
		int speed = Integer.parseInt(viv.nextLine());

		System.out.print("Number of Doors: ");
		int doors = Integer.parseInt(viv.nextLine());

		fleet.add(new Car(id, brand, speed, doors));
		System.out.println("Car added successfully.");
	}

	static void addBike() {
		System.out.print("Vehicle ID: ");
		String id = viv.nextLine();

		System.out.print("Brand: ");
		String brand = viv.nextLine();

		System.out.print("Speed: ");
		int speed = Integer.parseInt(viv.nextLine());

		System.out.print("Engine Type: ");
		String engineType = viv.nextLine();

		fleet.add(new Bike(id, brand, speed, engineType));
		System.out.println("Bike added successfully.");
	}

	static void addBus() {
		System.out.print("Vehicle ID: ");
		String id = viv.nextLine();

		System.out.print("Brand: ");
		String brand = viv.nextLine();

		System.out.print("Speed: ");
		int speed = Integer.parseInt(viv.nextLine());

		System.out.print("Capacity: ");
		int capacity = Integer.parseInt(viv.nextLine());

		fleet.add(new Bus(id, brand, speed, capacity));
		System.out.println("Bus added successfully.");
	}

	static void addElectricCar() {
		System.out.print("Vehicle ID: ");
		String id = viv.nextLine();

		System.out.print("Brand: ");
		String brand = viv.nextLine();

		System.out.print("Speed: ");
		int speed = Integer.parseInt(viv.nextLine());

		fleet.add(new ElectricCar(id, brand, speed));
		System.out.println("Electric Car added successfully.");
	}

	static void addElectricBike() {
		System.out.print("Vehicle ID: ");
		String id = viv.nextLine();

		System.out.print("Brand: ");
		String brand = viv.nextLine();

		System.out.print("Speed: ");
		int speed = Integer.parseInt(viv.nextLine());

		fleet.add(new ElectricBike(id, brand, speed));
		System.out.println("Electric Bike added successfully.");
	}

	static void displayAll() {
		if (fleet.isEmpty()) {
			System.out.println("No vehicles available.");
			return;
		}

		for (Vehicle vehicle : fleet) {
			vehicle.displayDetails();
			System.out.println();
		}
	}

	static void startVehicle() {
		System.out.print("Enter Vehicle ID: ");
		String id = viv.nextLine();

		Vehicle vehicle = findVehicle(id);

		if (vehicle == null) {
			System.out.println("Vehicle not found.");
			return;
		}

		vehicle.start();
	}

	static void stopVehicle() {
		System.out.print("Enter Vehicle ID: ");
		String id = viv.nextLine();

		Vehicle vehicle = findVehicle(id);

		if (vehicle == null) {
			System.out.println("Vehicle not found.");
			return;
		}

		vehicle.stop();
	}

	static void chargeVehicle() {
		System.out.print("Enter Vehicle ID: ");
		String id = viv.nextLine();

		Vehicle vehicle = findVehicle(id);

		if (vehicle == null) {
			System.out.println("Vehicle not found.");
			return;
		}

		if (vehicle instanceof Chargeable) {
			Chargeable chargeable = (Chargeable) vehicle;
			chargeable.charge();
		} else {
			System.out.println("This vehicle is not chargeable.");
		}
	}

	static void showGPS() {
		System.out.print("Enter Vehicle ID: ");
		String id = viv.nextLine();

		Vehicle vehicle = findVehicle(id);

		if (vehicle == null) {
			System.out.println("Vehicle not found.");
			return;
		}

		if (vehicle instanceof GPS) {
			GPS gps = (GPS) vehicle;
			gps.showLocation();
		} else {
			System.out.println("GPS is not available for this vehicle.");
		}
	}

	public static void main(String[] args) {
		boolean running = true;

		while (running) {
			try {
				System.out.println("\n===== SMART VEHICLE MANAGEMENT SYSTEM =====");
				System.out.println("1. Add Car");
				System.out.println("2. Add Bike");
				System.out.println("3. Add Bus");
				System.out.println("4. Add ElectricCar");
				System.out.println("5. Display All");
				System.out.println("6. Start Vehicle");
				System.out.println("7. Stop Vehicle");
				System.out.println("8. Charge Vehicle");
				System.out.println("9. Show GPS");
				System.out.println("10. Exit");
				System.out.println("11. Add ElectricBike");
				System.out.print("Enter choice: ");

				int choice = Integer.parseInt(viv.nextLine());

				switch (choice) {
					case 1:
						addCar();
						break;

					case 2:
						addBike();
						break;

					case 3:
						addBus();
						break;

					case 4:
						addElectricCar();
						break;

					case 5:
						displayAll();
						break;

					case 6:
						startVehicle();
						break;

					case 7:
						stopVehicle();
						break;

					case 8:
						chargeVehicle();
						break;

					case 9:
						showGPS();
						break;

					case 10:
						running = false;
						System.out.println("Exiting...");
						break;

					case 11:
						addElectricBike();
						break;

					default:
						System.out.println("Invalid choice.");
				}

			} catch (NumberFormatException e) {
				System.out.println("Please enter valid numeric input.");
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		viv.close();
	}
}
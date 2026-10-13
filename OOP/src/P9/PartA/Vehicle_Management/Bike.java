package P9.PartA.Vehicle_Management;

class Bike extends Vehicle {

	Bike(String number, String brand) {
		super(number, brand);
	}

	@Override
	void start() {
		System.out.println("Bike starts with self-start");
	}

	public void service() {
		System.out.println("Bike is being serviced");
	}
}

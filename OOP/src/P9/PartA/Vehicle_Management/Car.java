package P9.PartA.Vehicle_Management;

class Car extends Vehicle {

	Car(String number, String brand) {
		super(number, brand);
	}

	@Override
	void start() {
		System.out.println("Car starts with key/button");
	}

	public void service() {
		System.out.println("Car is being serviced");
	}
}
package P6.Patient_System;

public class Main {
	public static void main(String[] args) {
		Patient p = new Patient();

		p.setName("Rahul");
		p.setAge(25);
		p.setRoomNumber(12);

		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Room Number: " + p.getRoomNumber());
	}
}

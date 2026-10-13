package P6.Patient_System;
class Patient {
	private String name;
	private int age;
	private int roomNumber;

	public void setName(String name) {
		if (name != null && !name.trim().isEmpty())
			this.name = name;
		else
			System.out.println("Invalid Name");
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			System.out.println("Invalid Age");
	}

	public void setRoomNumber(int roomNumber) {
		if (roomNumber > 0)
			this.roomNumber = roomNumber;
		else
			System.out.println("Invalid Room Number");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
}


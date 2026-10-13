package P7.PartA.Student_Address;
class Student {
	int rollNo;
	String name;
	Address addr;

	Student(int rollNo, String name, Address addr) {
		this.rollNo = rollNo;
		this.name = name;
		this.addr = addr;
	}

	void display() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("City: " + addr.city);
		System.out.println("State: " + addr.state);
		System.out.println("Pincode: " + addr.pincode);
	}
}

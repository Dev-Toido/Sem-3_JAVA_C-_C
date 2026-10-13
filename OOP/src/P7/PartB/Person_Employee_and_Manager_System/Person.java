package P7.PartB.Person_Employee_and_Manager_System;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
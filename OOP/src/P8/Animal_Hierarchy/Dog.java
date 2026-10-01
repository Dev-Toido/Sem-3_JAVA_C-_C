package P8.Animal_Hierarchy;

public class Dog extends Animal {
	Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void sound() {
		System.out.println("P8.Animal_Hierarchy.Dog sound: Woof....");
	}
	void displayDetails() {
		System.out.println("P8.Animal_Hierarchy.Dog object has: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}

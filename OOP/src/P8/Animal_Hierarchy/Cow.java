package P8.Animal_Hierarchy;

public class Cow extends Animal {
	Cow(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void sound() {
		System.out.println("P8.Animal_Hierarchy.Cow sound: Moooo....");
	}
	void displayDetails() {
		System.out.println("P8.Animal_Hierarchy.Cow object has: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

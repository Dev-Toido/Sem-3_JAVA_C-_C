package P8.Animal_Hierarchy;

public class Cat extends Animal{
	Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void sound() {
		System.out.println("P8.Animal_Hierarchy.Cat sound: Meow....");
	}
	void displayDetails() {
		System.out.println("P8.Animal_Hierarchy.Cat object has: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

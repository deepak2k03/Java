//upcasting enables dynamic method dispatch (DMD happens at runtime)

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}

	void eat() {
		System.out.println("Dog eats food");
	}
}

public class upcasting_downcasting {
	public static void main(String[] args) {
		// 🔹 UPCASTING (Child → Parent)
		Animal obj = new Dog();
		obj.sound(); // Dynamic Method Dispatch

		// obj.eat(); ❌ Not allowed (reference type is Animal)

		// 🔹 DOWNCASTING (Parent → Child)
		Dog d = (Dog) obj;
		d.eat(); // Now accessible
		d.sound(); // Calls Dog's method

	}
}

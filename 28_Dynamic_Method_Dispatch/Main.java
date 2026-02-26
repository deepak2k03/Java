//Dynamic Method Dispatch is a mechanism by which a call to an overridden method is resolved at runtime, not at compile time.
// It is one of the core concepts behind runtime polymorphism in Java. 

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
  public static void main(String[] args) {
    Animal obj = new Dog();  // Parent reference, child object
    obj.sound();    
  }
}

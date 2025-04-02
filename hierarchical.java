// Parent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class hierarchicalinheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: Eating...
        dog.bark(); // Output: Barking...

        Cat cat = new Cat();
        cat.eat(); // Output: Eating...
        cat.meow(); // Output: Meowing...
    }
}

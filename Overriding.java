class Animal {
    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Output: The animal makes a sound.

        Dog dog = new Dog();
        dog.sound(); // Output: The dog barks.

        Cat cat = new Cat();
        cat.sound(); // Output: The cat meows.

        // Polymorphism
        Animal polymorphicAnimal = new Dog();
        polymorphicAnimal.sound(); // Output: The dog barks.
    }
}

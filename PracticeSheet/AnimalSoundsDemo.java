package PracticeSheet;

public class AnimalSoundsDemo {

    // Base class
    static class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound.");
        }
    }

    // Subclass: Dog
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            super.makeSound(); // Calls Animal's makeSound()
            System.out.println("Dog says: Bark Bark!");
        }
    }

    // Subclass: Cat
    static class Cat extends Animal {
        @Override
        public void makeSound() {
            super.makeSound(); // Calls Animal's makeSound()
            System.out.println("Cat says: Meow Meow!");
        }
    }

    // Main method
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("--- Animal ---");
        genericAnimal.makeSound();

        System.out.println("\n--- Dog ---");
        dog.makeSound();

        System.out.println("\n--- Cat ---");
        cat.makeSound();
    }

}
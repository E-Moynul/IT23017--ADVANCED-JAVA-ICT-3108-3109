public abstract class Animal {
    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("This animal is eating.");
    }

    public abstract void makeSound();
}

public interface Flyable {
    void fly();
}

class Dog extends Animal {
    public Dog(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Bird extends Animal implements Flyable {
    public Bird(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println("This bird is flapping its wings to fly.");
    }
}

class Airplane implements Flyable {
    private String model;

    public Airplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println("Airplane " + model + " is engaging its engines to fly.");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("--- 'is-a' Animal Relationship ---");
        Animal myDog = new Dog(5);
        myDog.eat();
        myDog.makeSound();

        Animal myBird = new Bird(2);
        myBird.eat();
        myBird.makeSound();

        System.out.println("\n--- 'can-do' Flyable Relationship ---");
        
        Flyable flyer1 = (Bird) myBird;
        Flyable flyer2 = new Airplane("Boeing 747");

        flyer1.fly();
        flyer2.fly();
    }
}

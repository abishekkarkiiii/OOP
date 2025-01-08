package All_OOP_Concept;

// Interface for behavior of Playable
interface Playable {
    void play();  // Abstract method that classes implementing this interface must define
}

// Abstract class Animal with some concrete and abstract methods
abstract class Animal {
    private String name;  // Encapsulation: private field

    // Constructor to initialize the name
    public Animal(String name) {
        this.name = name;
    }

    // Getter for the name (Encapsulation)
    public String getName() {
        return name;
    }

    // Abstract method for sound, must be implemented by subclasses
    public abstract void sound();

    // Concrete method for eating, can be inherited directly
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Dog class inheriting from Animal and implementing Playable interface
class Dog extends Animal implements Playable {
    // Constructor for Dog to pass name to Animal's constructor
    public Dog(String name) {
        super(name);
    }

    // Implementing the abstract method sound from Animal class
    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof!");
    }

    // Implementing the play method from Playable interface
    @Override
    public void play() {
        System.out.println(getName() + " is playing fetch!");
    }
}

// Cat class inheriting from Animal and implementing Playable interface
class Cat extends Animal implements Playable {
    // Constructor for Cat to pass name to Animal's constructor
    public Cat(String name) {
        super(name);
    }

    // Implementing the abstract method sound from Animal class
    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow!");
    }

    // Implementing the play method from Playable interface
    @Override
    public void play() {
        System.out.println(getName() + " is chasing a mouse!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        // Demonstrating Polymorphism and Method Overriding
        dog.sound();   // Woof! (Method overridden in Dog)
        dog.eat();     // Buddy is eating. (Inherited from Animal)

        cat.sound();   // Meow! (Method overridden in Cat)
        cat.eat();     // Whiskers is eating. (Inherited from Animal)

        // Demonstrating Playable interface methods
        Playable playableDog = new Dog("Rex");
        playableDog.play();  // Rex is playing fetch!

        Playable playableCat = new Cat("Luna");
        playableCat.play();  // Luna is chasing a mouse!

        // Demonstrating Encapsulation (using getter for name)
        System.out.println("The dog's name is: " + dog.getName());
        System.out.println("The cat's name is: " + cat.getName());
    }
}

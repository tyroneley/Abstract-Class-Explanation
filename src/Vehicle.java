// Abstract classes cannot be instantiated as an object
abstract class Vehicle {
    // Abstract method honkSound()
    public abstract void honkSound();

    // Abstract classes are used to provide a template/base for subclasses that inherit from it
    // The subclasses can then override the inhterited methods

    // Abstract methods can only be named, they do not have a body
    // Abstract methods can only be used in an abstract class

    // For example, Vehicle is an abstract class and Motorcycle is a subclass that extends Vehicle
    // The Vehicle abstract class has an abstract method honkSound()
    // Since Motorcycle extends Vehicle, it has to have a method honkSound()
    // The new honkSound() method in Motorcycle can have its own body
    // All classes that inherit from Vehicle needs to have a honkSound() method
}

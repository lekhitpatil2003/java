package Abstraction;

abstract class Vehicle {

    int noOfWheels;
    void displayWheels(){
        System.out.println("Number of Wheels: " + noOfWheels);
    }

    abstract void start();
}

class Car extends Vehicle {
    void start() {
        noOfWheels = 4;
        System.out.println("Car is starting");
    }
}

class Bike extends Vehicle {
    void start() {
        noOfWheels = 2;
        System.out.println("Bike is starting");
    }
}

public class AbstractionExample1 {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        car.start();
        car.displayWheels();
        
        Vehicle bike = new Bike();
        bike.start();
        bike.displayWheels();
    }
}

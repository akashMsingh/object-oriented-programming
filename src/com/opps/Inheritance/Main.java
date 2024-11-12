package com.opps.Inheritance;
/*Write a Java program to create a vehicle class hierarchy. The base class should be 
 * Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties 
 * such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, 
 * distance traveled, and maximum speed.
 */

public class Main {
    
    // Main method to execute the program
    public static void main(String[] args) {

        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);

        Car1 car = new Car1("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);

        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);

        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
    }
}

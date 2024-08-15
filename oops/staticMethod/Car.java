package oops.staticMethod;

public class Car implements Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Output: Vehicle is starting
        car.end();
        car.start();
    }
}



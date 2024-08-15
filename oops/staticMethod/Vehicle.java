package oops.staticMethod;

public interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting");
    }
    default void work() {
        System.out.println("Vehicle is accelerating");
    }
    default void   end() {
        System.out.println("apply breaks");
    }
}

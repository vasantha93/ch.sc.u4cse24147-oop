interface Vehicle {
    void start();

    default void stop() { 
        System.out.println("Vehicle is stopping.");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting.");
    }
}

public class vehical_info {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Output: Car is starting.
        myCar.stop();  // Output: Vehicle is stopping.
    }
}

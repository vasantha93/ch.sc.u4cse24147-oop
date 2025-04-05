class Car {
    String brand;
    int year;
       Car() {
        this.brand = "Unknown";
        this.year = 0;
       
    }
        Car(String brand) {
        this.brand = brand;
        this.year = 2024; // Default year
        System.out.println("Constructor with brand called.");
    }
    
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Constructor with brand and year called.");
    }

    void display() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }
}

public class Car_Details {
    public static void main(String[] args) {
        Car car1 = new Car(); // Calls default constructor
        car1.display();
        
        Car car2 = new Car("Toyota");
        car2.display();
        
        Car car3 = new Car("Honda", 2020); 
        car3.display();
    }
}

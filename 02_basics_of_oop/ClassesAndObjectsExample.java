class Car {

    // 1. Fields (attributes)
    String brand;
    String color;
    int speed;

    // 2. Constructor
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // 3. Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    // 4. Method to accelerate the car
    void accelerate(int increase) {
        speed = speed + increase;
        System.out.println(brand + " accelerated to " + speed + " km/h.");
    }

    // 5. Method to stop the car
    void stop() {
        speed = 0;
        System.out.println(brand + " has stopped.");
    }
}

public class ClassesAndObjectsExample {
    public static void main(String[] args) {

        // 6. Creating objects of the Car class
        Car car1 = new Car("Toyota", "Red", 60);
        Car car2 = new Car("Honda", "Blue", 80);

        // 7. Display details of the first object
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        // 8. Display details of the second object
        System.out.println("\nCar 2 Details:");
        car2.displayDetails();

        // 9. Calling methods on objects
        System.out.println("\nCar Actions:");

        car1.accelerate(20);
        car2.accelerate(10);

        car1.stop();

        // 10. Display updated details
        System.out.println("\nUpdated Car 1 Details:");
        car1.displayDetails();
    }
}

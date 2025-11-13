class Vehicle {
    String brand;
    String type;
    String color;
    int year;
    int maxspeed;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Car Max Speed:");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Vios";
        myCar.type = "Sedan";
        myCar.color = "Gray";
        myCar.year = 2007;
        myCar.maxspeed = 180;

        myCar.start();
        myCar.displayInfo();
    }
}

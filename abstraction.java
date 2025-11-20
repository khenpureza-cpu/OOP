// Act7: Abstract
abstract class Vehicle {
    String brand;
    String model;
    String type;
    String color;
    int year;

    abstract void startEngine();
    abstract void stopEngine();

    void showBrand() {
        System.out.println("Brand: " + brand);
    }

    void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Car class
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started using kick start.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Abstraction: Using Vehicle reference for Car
        Vehicle myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Vios";
        myCar.type = "Sedan";
        myCar.color = "Gray";
        myCar.year = 2007;

        // Abstraction: Using Vehicle reference for Motorcycle
        Vehicle myBike = new Motorcycle();
        myBike.brand = "Honda";
        myBike.model = "CBR";
        myBike.type = "Sport";
        myBike.color = "Red";
        myBike.year = 2023;

        System.out.println("=== CAR ===");
        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();
        myCar.showInfo();

        System.out.println("\n=== MOTORCYCLE ===");
        myBike.showBrand();
        myBike.startEngine();
        myBike.stopEngine();
        myBike.showInfo();
    }
}

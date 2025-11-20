// Act 6: Polymorphism
class Vehicle {
    void info() {
        System.out.println("This is a vehicle");
    }
    void info(String detailType, String value) {
        System.out.println(detailType.toUpperCase() + ": " + value);
    }
    void info(String detailType, int value) {
        if (detailType.equalsIgnoreCase("maxspeed")) {
            System.out.println("Vehicle has an average speed: " + value + " km/h");
        } else {
            System.out.println(detailType.toUpperCase() + ": " + value);
        }
    }
    void speed() {
        System.out.println("Vehicle has an average speed.");
    }
}
class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 150 km/h.");
    }
}
class Motorcycle extends Vehicle {
    @Override
    void speed() {
        System.out.println("Motorcycle runs at 120 km/h.");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.info();
        v.info("brand", "Toyota");
        v.info("year", 2008);
        v.info("type", "Sedan");
        v.info("color", "Gray");
        v.info("maxspeed", 180);
        v.speed();

        System.out.println();

        v = new Motorcycle();
        v.info();
        v.info("brand", "Honda");
        v.info("year", 2011);
        v.info("type", "Type R");
        v.info("color", "Pink");
        v.info("maxspeed", 140);
        v.speed();
    }
}

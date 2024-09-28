public class vehicle {
    public static void main(String[] args){
        Truck t = new Truck("Toyota", "Tacoma", 2020, "Gasoline", 20, 120);
        Car c = new Car("Toyota", "Camry", 2020, "Gasoline", 30, 100);
        Motorcycle m = new Motorcycle("Honda", "CBR", 2020, "Gasoline", 40, 150);
        System.out.println("Truck distance traveled: " + t.distanceTraveled(20));
        System.out.println("Car distance traveled: " + c.distanceTraveled(20));
        System.out.println("Motorcycle distance traveled: " + m.distanceTraveled(20));
    }
}

class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

}

class Truck extends Vehicle {
    protected double fuelEfficiency;
    protected double maxSpeed;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    public double distanceTraveled(double fuel) {
        return fuel * fuelEfficiency;
    }
}

class Car extends Vehicle {
    protected double fuelEfficiency;
    protected double maxSpeed;

    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    public double distanceTraveled(double fuel) {
        return fuel * fuelEfficiency;
    }
}

class Motorcycle extends Vehicle {
    protected double fuelEfficiency;
    protected double maxSpeed;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    public double distanceTraveled(double fuel) {
        return fuel * fuelEfficiency;
    }
}
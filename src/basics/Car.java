package basics;

public class Car {

    String color, make, model;
    private byte seats, doors, numCylinders;
    protected double year, horsePower;
    public double weight;

    //access level: default (package-private)


    //add getters and setters aka accessors and mutators

    //alt+insert  right-click => Generate


    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {

        if (seats < 2 || seats > 8) {
            System.out.println("Seats motvalid");
            return;
        }


        this.seats = seats;
    }

    public byte getDoors() {
        return doors;
    }

    public void setDoors(byte doors) {
        this.doors = doors;
    }

    public byte getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(byte numCylinders) {
        this.numCylinders = numCylinders;
    }

    public Car() {
    }

    //alt+insert
    //right-click=>Generate


    public Car(String color, String make, String model, byte seats, byte doors, byte numCylinders, double year, double horsePower, double weight) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.seats = seats;
        this.doors = doors;
        this.numCylinders = numCylinders;
        this.year = year;
        this.horsePower = horsePower;
        this.weight = weight;
    }

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, double year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(double year, String make, String model) {
        this(make, model, year);
    }
}
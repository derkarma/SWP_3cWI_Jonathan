package at.jonathan.objectOrientation;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Batmobile";
        c1.fuelConsumption = 15;
        c1.serialNumber = "B53556";
        c1.fuelAmount = 40;
        c1.drivenRoute = 23;


        Car c2 = new Car();
        c2.brand = "Toyota";
        c2.fuelConsumption = 6;
        c2.serialNumber = "2600003";
        c2.fuelAmount = 30;
        c2.drivenRoute = 3;

        c1.drive();
        c1.drivingBreak();



    }
}

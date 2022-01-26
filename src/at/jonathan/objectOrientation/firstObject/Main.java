package at.jonathan.objectOrientation.firstObject;

import at.jonathan.objectOrientation.firstObject.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Batmobile";
        c1.fuelConsumption = 15;
        c1.serialNumber = "B53556";
        c1.color = "black";
        c1.tankVolume = 50;
        c1.fuelAmount = 2;
        c1.drivenRoute = 23;


        Car c2 = new Car();
        c2.brand = "Toyota";
        c2.fuelConsumption = 6;
        c2.serialNumber = "2600003";
        c2.color = "gold";
        c2.tankVolume = 40;
        c2.fuelAmount = 30;
        c2.drivenRoute = 3;

        c1.drive();
        c1.drivingBreak();
        c1.turboBoost();
        c1.honk(4);
        c2.getRemainingRange();



    }
}

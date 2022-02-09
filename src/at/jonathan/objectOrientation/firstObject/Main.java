package at.jonathan.objectOrientation.firstObject;

import at.jonathan.objectOrientation.firstObject.Car;

public class Main {
    public static void main(String[] args) {

        Engine e1= new Engine(2, Engine.TYPE.DIESEL);
        Car c1 = new Car(15, "Batmobile","B53556","black",50,2,23);
        Car c2 = new Car(6,"Toyota","2600003","gold",40,30,3);
        Car c3 = new Car(17, "Opel", "1234O","green", 30,20, 9);


        System.out.println(c1.getColor());
        System.out.println(c2.getBrand());
        System.out.println(c3.getTankVolume());
        /*
        c1.drive();
        c1.drivingBreak();
        c1.turboBoost();
        c1.honk(4);
        c2.getRemainingRange();
         */




    }
}

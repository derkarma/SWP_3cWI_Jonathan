package at.jonathan.objectOrientation.Car;

public class Main {
    public static void main(String[] args) {

        Engine e1= new Engine(2, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-40);
        Wire w1 = new Wire(2,"wide tire");
        Wire w2 = new Wire(2.5,"winter tires");
        Wire w3 = new Wire(1.5,"sommer tires");
        Wire w4 = new Wire(1,"all-season tires");
        Car c1 = new Car(15, "Batmobile","B53556","black",50,2,23);
        Car c2 = new Car(6,"Toyota","2600003","gold",40,30,3);
        Car c3 = new Car(17, "Opel", "1234O","green", 30,20, 9);
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addWire(w1);
        c1.addWire(w2);
        c1.addWire(w3);
        c1.addWire(w4);

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

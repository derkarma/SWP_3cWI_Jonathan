package at.jonathan.objectOrientation.Cars;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(2, Engine.TYPE.DIESEL);
        Producer p1 = new Producer("Mercedes","Germany",0.2);
        Car c1 = new Car("red",200,7000,8,e1,p1,400000,2,3);

        Truck t1 = new Truck("red",200,850,8,e1,p1,45,5,9,"trailer1");

        //System.out.println(t1.getColor() + t1.getTrailer());

        t1.drive();
        t1.stop();

        //c1.price();
        //c1.fuelConsumption();

    }








}

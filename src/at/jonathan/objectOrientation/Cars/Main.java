package at.jonathan.objectOrientation.Cars;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(2, Engine.TYPE.DIESEL);
        Producer p1 = new Producer("Mercedes","Germany",0.2);
        Car c1 = new Car("red",200,7000,8,e1,p1,400000);

        c1.price();
        c1.fuelConsumption();

    }








}

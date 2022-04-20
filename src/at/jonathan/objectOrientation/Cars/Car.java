package at.jonathan.objectOrientation.Cars;

public class Car {

    private String color;
    private int fullSpeed;
    private int basePrice;
    private double basicConsumption;
    private Engine engine;
    private Producer producer;
    private double drivenKilometers;
    private int fuelAmount;
    private int fuelConsumption;

    public Car(String color, int fullSpeed, int basePrice, double basicConsumption, Engine engine, Producer producer, double drivenKilometers, int fuelAmount, int fuelConsumption) {
        this.color = color;
        this.fullSpeed = fullSpeed;
        this.basePrice = basePrice;
        this.basicConsumption = basicConsumption;
        this.engine = engine;
        this.producer = producer;
        this.drivenKilometers = drivenKilometers;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Let's go");

    }

    public void stop(){
        System.out.println("I am breaking ...car");
    }

    public void price(){
        double rabatt = this.producer.getRabatt();
        double price = basePrice-(basePrice*rabatt);
        System.out.println("Preis ohne Rabatt: " + basePrice);
        System.out.println("Preis mit Rabatt: " + price);
    }

    public void fuelConsumption(){


        if(drivenKilometers > 50000){
            double consumptionPercent = 1.098;
            setBasicConsumption((int) (basicConsumption*consumptionPercent));

            double newFuelConsumption1 = getBasicConsumption();
            System.out.println(newFuelConsumption1);
        }else{
            double newFuelConsumption2 = getBasicConsumption();
            System.out.println(newFuelConsumption2);
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFullSpeed() {
        return fullSpeed;
    }

    public void setFullSpeed(int fullSpeed) {
        this.fullSpeed = fullSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasicConsumption() {
        return basicConsumption;
    }

    public void setBasicConsumption(int basicConsumption) {
        this.basicConsumption = basicConsumption;
    }
}

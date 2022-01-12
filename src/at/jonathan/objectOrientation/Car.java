package at.jonathan.objectOrientation;

public class Car {

    // "public" and "private" not use later
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    private String color;
    public int fuelAmount;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Let's go");

    }
}

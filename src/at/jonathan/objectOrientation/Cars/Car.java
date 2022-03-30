package at.jonathan.objectOrientation.Cars;

public class Car {

    private String color;
    private int fullSpeed;
    private int basePrice;
    private int basicConsumption;

    public Car(String color, int fullSpeed, int basePrice, int basicConsumption) {
        this.color = color;
        this.fullSpeed = fullSpeed;
        this.basePrice = basePrice;
        this.basicConsumption = basicConsumption;
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

    public int getBasicConsumption() {
        return basicConsumption;
    }

    public void setBasicConsumption(int basicConsumption) {
        this.basicConsumption = basicConsumption;
    }
}

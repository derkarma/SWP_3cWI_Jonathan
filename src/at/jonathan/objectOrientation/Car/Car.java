package at.jonathan.objectOrientation.Car;

import java.util.ArrayList;
import java.util.List;

public class Car {

    // "public" and "private" not use later
    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Wire> wires;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;
    private int tankVolume;
    private int fuelAmount;
    private int drivenRoute;


    public void setFuelConsumption(int fuelConsumption) {
        fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setDrivenRoute(int drivenRoute) {
        this.drivenRoute = drivenRoute;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getDrivenRoute() {
        return drivenRoute;
    }

    public Car(int fuelConsumption, String brand, String serialNumber, String color, int tankVolume, int fuelAmount, int drivenRoute){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.tankVolume = tankVolume;
        this.fuelAmount = fuelAmount;
        this.drivenRoute = drivenRoute;
        this.mirrors = new ArrayList<>();
        this.wires = new ArrayList<>();


    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void addWire(Wire wire){this.wires.add(wire);}

    public List<Wire> getWires() {
        return wires;
    }

    //Methode
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Let's go");

    }

    public void drivingBreak() {
        if (this.drivenRoute > 10) {
            System.out.println("I need a break");
        }
    }

    public void turboBoost() {
        if (this.tankVolume * 0.1 < fuelAmount) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go Superboost");
        }

    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.print(" Tuuut ");
        }

    }

    public void getRemainingRange(){
        System.out.println(this.tankVolume-this.fuelConsumption + " Liter sind noch übrigen um zu fahren ");

    }

}


//Füge eine Methode getRemainingRange() ein.
// Diese Methode liefert die Rest-Reichweite des Autos zurück. Diese wird berechnet über den Tankstand und den Verbrauch.
package at.jonathan.objectOrientation.firstObject;

public class Car {

    // "public" and "private" not use later
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    public String color;
    public int tankVolume;
    public int fuelAmount;
    public int drivenRoute;

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
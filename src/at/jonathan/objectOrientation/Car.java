package at.jonathan.objectOrientation;

public class Car {

    // "public" and "private" not use later
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    private String color;
    public int fuelAmount;
    public int drivenRoute;

    //Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Let's go");

    }

    public void drivingBreak() {
        if (this.drivenRoute > 10) {
            System.out.println("I need a break");
        }
    }

    public void turboBoost() {
        }

    }



//Füge eine Methode break() ein. Die Methode gibt den String "Ich bremse" aus.
// Füge eine Methode turboBoost() ein.
// Diese Methode prüft ob der Benzinstand größer als 10% des Tankvolumens ist.
// Wenn ja gibt die Methode den Text "SuperBoostMode" aus. Ansonsten wird "Not enough fuel to go to Superboost".
//
//Füge eine Methode honk(int amountOfRepetitions) ein.
// Die Methode honk hupt (gibt auf der Konsole den Text "Tuuut" aus.
// Über den Parameter amountOfRepetitions kann gesteuert werden wie oft gehupt wird.
//
//Füge eine Methode getRemainingRange() ein.
// Diese Methode liefert die Rest-Reichweite des Autos zurück. Diese wird berechnet über den Tankstand und den Verbrauch.
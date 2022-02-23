package at.jonathan.objectOrientation.firstObject;

public class Engine {
    public enum TYPE{DIESEL,OIL};
    private int horsePower;
    private TYPE type; //Diesel oder Benzin
    private int speed;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }


    /*
   amount should be between 0 and 100
   */

    public void drive(int amount){
        System.out.println("The motor is running with" + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

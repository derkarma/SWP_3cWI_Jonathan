package at.jonathan.objectOrientation.Cars;

public class Engine {

    public enum TYPE{DIESEL,PETROL};
    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}

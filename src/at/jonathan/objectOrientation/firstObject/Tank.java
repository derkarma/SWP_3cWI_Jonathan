package at.jonathan.objectOrientation.firstObject;

public class Tank {

    private int tankVolume;

    public Tank(int fuelAmount){
        this.tankVolume = fuelAmount;
    }

    public int getFuelAmount() {
        return tankVolume;
    }
}

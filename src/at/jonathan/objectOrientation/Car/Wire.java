package at.jonathan.objectOrientation.Car;

public class Wire {
    private double tirePressure;
    private String wireType;

    public Wire(double tirePressure, String wireType) {
        this.tirePressure = tirePressure;
        this.wireType = wireType;
    }

    public void setTirePressure(int tirePressure) {
        this.tirePressure = tirePressure;
    }

    public String getWireType() {
        return wireType;
    }

    public void setWireType(String wireType) {
        this.wireType = wireType;
    }
}

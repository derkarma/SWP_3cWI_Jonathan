package at.jonathan.objectOrientation.firstObject;

public class Wire {
    private int tirePressure;
    private String wireType;

    public Wire(int tirePressure, String wireType) {
        this.tirePressure = tirePressure;
        this.wireType = wireType;
    }

    public int getTirePressure() {
        return tirePressure;
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

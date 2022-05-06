package at.jonathan.objectOrientation.geometricFigures;

import com.sun.jdi.Value;

public class Cube extends Figure{

    private int ValueA;
    private int ValueB;
    private int ValueC;

    public Cube(String name, int valueA, int valueB, int valueC) {
        super(name);
        ValueA = valueA;
        ValueB = valueB;
        ValueC = valueC;
    }

    @Override
    public double getArea() {
        return ValueA * ValueB * ValueC;
    }
}

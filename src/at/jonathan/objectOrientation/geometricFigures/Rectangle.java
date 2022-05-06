package at.jonathan.objectOrientation.geometricFigures;

import com.sun.jdi.Value;

public class Rectangle extends Figure {

    private int ValueA;
    private int ValueB;

    public Rectangle(String name, int valueA, int valueB) {
        super(name);
        ValueA = valueA;
        ValueB = valueB;
    }

    @Override
    public double getArea() {
        return ValueA * ValueB;
    }
}

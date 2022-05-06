package at.jonathan.objectOrientation.geometricFigures;

public class Circle extends Figure{

    private int ValueRadius;

    public Circle(String name, int valueRadius) {
        super(name);
        ValueRadius = valueRadius;
    }

    @Override
    public double getArea() {
        return Math.toIntExact(Math.round(Math.PI)) * (ValueRadius * ValueRadius);
    }
}

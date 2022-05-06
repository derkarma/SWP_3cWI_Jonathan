package at.jonathan.objectOrientation.geometricFigures;

public class Square extends Figure {

    private double ValueA;

    public Square(String name,double ValueA) {
        super(name);
        this.ValueA = ValueA;
    }

    @Override
    public double getArea() {
        return this.ValueA * this.ValueA;
    }
}

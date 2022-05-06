package at.jonathan.objectOrientation.geometricFigures;

public class Main {
    public static void main(String[] args) {

        Square s1= new Square("Kreis",34);

        s1.getArea();
        s1.getName();

        Rectangle r1 = new Rectangle("Rechteckt", 21,23);

        r1.getArea();
        r1.getName();

        Circle cc1 = new Circle("Kreis",8);

        cc1.getArea();
        cc1.getName();

        Cube cb1 = new Cube("Kugel",12,23,7);

        cb1.getArea();
        cb1.getName();



    }
}

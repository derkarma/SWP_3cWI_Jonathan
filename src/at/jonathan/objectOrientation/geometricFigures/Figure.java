package at.jonathan.objectOrientation.geometricFigures;

public class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public double getArea(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

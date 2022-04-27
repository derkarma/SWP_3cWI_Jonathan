package at.jonathan.objectOrientation.Calculator;

import java.sql.SQLOutput;

public class scientificCalculator extends basicCalculator{

    public scientificCalculator(String brand){
        super(brand);
    }

    public void cos(double angle){
        double anglesCosinus = Math.cos(angle);
        System.out.println("Der Cosinus von dem Winkel " + angle + " beträgt " + anglesCosinus);
    }

    public void sin(double angle){
        double anglesSinus = Math.sin(angle);
        System.out.println("Der Sinus von dem Winkel " + angle + " beträgt " + anglesSinus);
    }

}

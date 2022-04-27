package at.jonathan.objectOrientation.Calculator;

import java.sql.SQLOutput;

public class basicCalculator {

    private String brand;


    public basicCalculator(String brand) {
        this.brand = brand;
    }


    public void addition(int value1, int value2){
        int valuesAdded = value1 + value2;
        System.out.println("Die Addition von " + value1 + " und " + value2 + " ergibt " + valuesAdded);
    }

    public void subtraction(int value1, int value2){
        int valuesSubtracted = value1 - value2;
        System.out.println("Die Subtraktion von " + value1 + " und " + value2 + " ergibt " + valuesSubtracted);
    }

    public void multiplication(int value1, int value2){
        int valuesMultiplied = value1 * value2;
        System.out.println("Die Multiplikation von " + value1 + " und " + value2 + " ergibt " + valuesMultiplied);
    }

    public void divide(int value1, int value2){
        int valuesDivided = value1 / value2;
        System.out.println("Die Division von " + value1 + " und " + value2 + " ergibt " + valuesDivided);
    }
}

package at.jonathan.objectOrientation.Calculator;

public class rootCalculator extends basicCalculator{

    public rootCalculator(String brand){
        super(brand);
    }

    public void rooting(double value){
        double rootedValue = Math.sqrt(value);
        System.out.println("Die Wurzel von " + value + " ergibt " + rootedValue);
    }


}

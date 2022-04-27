package at.jonathan.objectOrientation.Calculator;

public class Main {
    public static void main(String[] args) {

        basicCalculator bC = new basicCalculator("TEXAS Instrument");
        scientificCalculator sC= new scientificCalculator("CASIO");
        rootCalculator rC = new rootCalculator("CITIZEN");

        bC.addition(7,2);
        bC.subtraction(45,23);
        bC.multiplication(6,3);
        bC.divide(88,4);

        sC.cos(480);
        sC.sin(45.56);
        sC.addition(523,25);

        rC.rooting(48);
        rC.divide(25,5);







    }
}

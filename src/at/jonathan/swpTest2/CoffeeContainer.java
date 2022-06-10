package at.jonathan.swpTest2;

public class CoffeeContainer {

    private int CoffeeSize;
    private int CoffeeStrength;

    public CoffeeContainer(int coffeeSize, int coffeeStrength) {
        CoffeeSize = coffeeSize;
        CoffeeStrength = coffeeStrength;
    }

    public int getCoffeeSize() {
        return CoffeeSize;
    }

    public void setCoffeeSize(int coffeeSize) {
        CoffeeSize = coffeeSize;
    }

    public int getCoffeeStrength() {
        return CoffeeStrength;
    }

    public void setCoffeeStrength(int coffeeStrength) {
        CoffeeStrength = coffeeStrength;
    }
}

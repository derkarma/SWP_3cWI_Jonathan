package at.jonathan.objectOrientation.Cars;

public class Truck extends Car{
    private String trailer;

    public Truck(String color, int fullSpeed, int basePrice, double basicConsumption, Engine engine, Producer producer, double drivenKilometers,int fuelAmount, int fuelConsumption, String trailer) {
        super(color, fullSpeed, basePrice, basicConsumption, engine, producer, drivenKilometers, fuelAmount, fuelConsumption);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public void drive(){
        System.out.println("i am driving the truck - consumption is high");
        //super.drive();
    }

}

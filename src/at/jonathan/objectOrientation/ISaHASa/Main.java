package at.jonathan.objectOrientation.ISaHASa;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal(40,20);
        Animal a2 = new Animal(50,40);

        Zoo zoo = new Zoo("Partyzoo","Partystraße");

        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.printAnimals();

        Dog d1 = new Dog(30,30);
        zoo.addAnimal(d1);

        zoo.printAnimals();

        d1.bark();
    }
}

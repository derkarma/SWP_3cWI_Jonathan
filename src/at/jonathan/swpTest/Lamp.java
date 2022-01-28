package at.jonathan.swpTest;

import java.util.HashSet;
import java.util.Set;

public class Lamp {

    public int GlowStatus;

    public void turnAllOn(){
        if (this.GlowStatus == 1){
            System.out.println("Alle Glühelemente sind an");
        }else if (this.GlowStatus == 2){
            System.out.println("Alle Glühelemente sind aus");
        }
    }



}
/*
    Sepp hat eine spezielle Lampe entwickelt. Die Lampe hat x  Glühelemente.
    Jedes Glühelement hat einen Namen, eine Farbe, Stromverbrauch und einen Status (ein oder aus).
    Programmiere einen Konstruktor und die zugehörigen Getter/Setter.
    Ein Glühelement kann man mit der Methode turnOn() einschalten.
    Wenn die Lampe bereits eingeschaltet ist schreibt sie auf die Konsole - "Mein Name ist XXX.
    Ich bin bereits eingeschaltet". Bei jedem einschalten steigt der Stromverbrauch um den Wert 5.

        Die Lampe hat folgende Methoden:

        addLightElement(LightElement):void um ein Glühelement dazu zu geben.

        turnAllOn():void - Da werden alle Glühelemente eingeschaltet.

        getOverallPowerUsage(): double - Liefert den bisher verbrauchten Strom aller Glühelemente zurück.

        printNamesOfLightElements():void - Printet die Namen aller Lichtelemen auf die Konsole.
    */

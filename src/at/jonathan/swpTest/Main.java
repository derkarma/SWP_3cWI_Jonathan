package at.jonathan.swpTest;

public class Main {
    public static void main(String[] args) {

        Lamp l = new Lamp();
        l.GlowStatus = 1;

        GlowElement g1 = new GlowElement();
        g1.name = "Glühelement Nr.1";
        g1.color = "red";
        g1.powerConsumption = 30;
        g1.powerAmount = 50;
        g1.GlowElementStatus =1;

        GlowElement g2 = new GlowElement();
        g2.name = "Glühelement Nr.2";
        g2.color = "red";
        g2.powerConsumption = 20;
        g2.powerAmount = 50;
        g2.GlowElementStatus = 1;

        GlowElement g3 = new GlowElement();
        g3.name = "Glühelement Nr.3";
        g3.color = "red";
        g3.powerConsumption = 25;
        g3.powerAmount = 50;
        g3.GlowElementStatus = 2;

        GlowElement g4 = new GlowElement();
        g4.name = "Glühelement Nr.4";
        g4.color = "red";
        g4.powerConsumption = 23;
        g4.powerAmount = 50;
        g4.GlowElementStatus = 0;


        l.turnAllOn();
        g1.currentPower();









    }
}

package at.jonathan.swpTest2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine cm = new CoffeeMachine("Phillips","black",0);
        CoffeeContainer cc = new CoffeeContainer( 40,8);
        WaterTank wt = new WaterTank(900);
        BeanTank bt = new BeanTank(500);


        boolean isFinished = false;
        while (!isFinished){

            System.out.println("1. Einschalten");
            System.out.println("2. Größe des Kaffees einstellen ");
            System.out.println("3. Stärke des Kaffees einstellen");
            System.out.println("4. Wasser nachfüllen");
            System.out.println("5. Bohnen nachfüllen");
            System.out.println("6. Kaffee rauslassen");
            System.out.println("7. Ausschalten");

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1){
                Scanner scanner1 = new Scanner(System.in);
                cm.setState(1);
                System.out.println("Ihre Kaffeemaschine ist nun an");
            }
            else if (selection == 2){
                Scanner scanner2 = new Scanner(System.in);
                int size = scanner2.nextInt();
                cc.setCoffeeSize(size);

                if(size < 40 && size > 200){
                    System.out.println("Die Größe Ihres Kaffes ist " + size);
                }else{
                    System.out.println("Diese Größe gibt es nicht");
                }

            }

            else if(selection == 3){
                Scanner scanner3 = new Scanner(System.in);
                int strength = scanner.nextInt();
                cc.setCoffeeStrength(strength);

                if(strength > 1 && strength < 10){
                    System.out.println("Die Stärke Ihres Kaffees beträgt " + strength);
                }
            }

            else if(selection == 4){

                if(wt.getWaterStand() < 40 || wt.getWaterStand() < 200){
                    wt.setWaterStand(1000);
                    System.out.println("Ihr Wasser wurde nachgefüllt");
                }else{
                    System.out.println("Sie haben noch genug Wasser");
                }
            }

            else if(selection == 5){

                if(bt.getBeanStand() < 30 || bt.getBeanStand() < 150){
                    bt.setBeanStand(800);
                    System.out.println("Ihre Bohnen wurden aufgefüllt");
            }else{
                    System.out.println("Sie haben noch genug Bohen");
                }
            }

            else if(selection == 6){

                if(cm.getState() == 1 && wt.getWaterStand() < 40 || wt.getWaterStand() < 200) && bt.getBeanStand() < 30 || bt.getBeanStand() < 150)){
                    System.out.println("Kaffe wird rausgelassen");
                }else{
                    System.out.println("Überprüfen Sie ob ihre Maschine an ist und genug Wasser und Bohen vorhanden sind");
                }
            }

            else if(selection == 7){
                Scanner scanner4 = new Scanner(System.in);
                cm.setState(0);
                System.out.println("Ihre Kaffeemaschine ist nun aus");
                isFinished = true;
            }

        }



    }
}

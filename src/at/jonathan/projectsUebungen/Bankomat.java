package at.jonathan.projectsUebungen;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        int total = 0;
        boolean isFinished = false;
        while (!isFinished) {

            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();


            if (selection == 1) {
                Scanner scanner1 = new Scanner(System.in);
                double deposit = scanner1.nextDouble();
                double plus = deposit;
                System.out.println("Ihr Kontostand beträgt " + deposit + " €");
                total += plus;

            } else if (selection == 2) {
                Scanner scanner2 = new Scanner(System.in);
                double abheben = scanner2.nextInt();
                var minus = abheben;
                System.out.println("Ihr Kontostand beträgt " + abheben + " €");
                total -= minus;


            }else if (selection == 3) {
                System.out.println("Ihr Kontostand beträgt " + total + " €");


            }else if (selection == 4) {
                isFinished = true;

            }

        }

    }
}




package at.jonathan.projectsBasics.loopUebungen;

import java.util.Random;

public class While {
    public static void main(String[] args) {



        boolean isFinished = false;
        int total = 0;


        while (!isFinished) {

            //Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
            Random random = new Random();
            int randomNumber1 = 10 + random.nextInt(30 - 10 + 1);
            int randomNumber2 = 10 + random.nextInt(30 - 10 + 1);


            // Das Programm soll die Zufallszahlen zusammenzählen.
            var addition = randomNumber1 + randomNumber2;
            System.out.println(randomNumber1 + " & " + randomNumber2);
            total += addition;


            // Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!
            if (randomNumber1 == 15 || randomNumber2 == 15 ){
                isFinished = true;
                System.out.println("finished, 15");
            }
            else if (randomNumber1 == 25 || randomNumber2 == 25){
                isFinished = true;
                System.out.println("finished, 25");
            }




        }

        System.out.println(total + " ist die Summe");

    }
}

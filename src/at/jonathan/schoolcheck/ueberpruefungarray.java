package at.jonathan.schoolcheck;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ueberpruefungarray {
    public static void main(String[] args) {

        String[] array1 = {"Er", "Sie"};
        String[] array2 = {"geht", "rennt", "fährt"};
        String[] array3 = {"nach Hause", "zur Schule", "ins Büro", "zur Party"};

        Scanner platzhalter = new Scanner(System.in);
        Random random = new Random();

        int select = platzhalter.nextInt();
        for (int i = 0; i < platzhalter.nextInt(); i++) {

            int randomArray1 = i + random.nextInt(2);
            int randomArray2 = i + random.nextInt(3);
            int randomArray3 = i + random.nextInt(4);

            int phrase1 = randomArray1;
            int phrase2 = randomArray2;
            int phrase3 = randomArray3;

            System.out.println(array1[phrase1] + array2[phrase2] + array3[phrase3]);
        }







    }
}


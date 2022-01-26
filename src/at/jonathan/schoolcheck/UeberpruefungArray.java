package at.jonathan.schoolcheck;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UeberpruefungArray {
    public static void main(String[] args) {

        String[] personalPronoun = {"Er", "Sie"};
        String[] verb = {"geht", "rennt", "fährt"};
        String[] noun = {"nach Hause", "zur Schule", "ins Büro", "zur Party"};

        Scanner fullPhrase = new Scanner(System.in);
        Random random = new Random();

        int select = fullPhrase.nextInt();
        for (int i = 0; i < fullPhrase.nextInt(); i++) {

            int randomArray1 = i + random.nextInt(2);
            int randomArray2 = i + random.nextInt(3);
            int randomArray3 = i + random.nextInt(4);

            int phrase1 = randomArray1;
            int phrase2 = randomArray2;
            int phrase3 = randomArray3;

            System.out.println(personalPronoun[phrase1] + verb[phrase2] + noun[phrase3]);
        }


    }
}


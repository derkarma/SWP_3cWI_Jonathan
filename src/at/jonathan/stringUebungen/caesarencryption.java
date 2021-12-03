package at.jonathan.stringUebungen;

import java.util.Scanner;

public class caesarencryption {
    public static void main(String[] args) {

        //Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben
        // (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
        //Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String

        Scanner scanner = new Scanner(System.in);
        System.out.println("Text den Sie verschlüsseln möchten eingeben");
        String text = scanner.nextLine();

        System.out.println("Eingeben um wie viele Stellen sie den Text verschieben möchten (1-10)");
        int shift = scanner.nextInt();

        if (shift >= 1 && shift <= 10);

        char[] firstArray = text.toCharArray();










    }
}

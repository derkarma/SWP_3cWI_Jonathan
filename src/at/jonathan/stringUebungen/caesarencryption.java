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


        System.out.println("Eingeben um wie viele Stellen sie den Text verschieben möchten (1-15)");
        int shift = scanner.nextInt();

        if (shift >= 1 && shift <= 15) ;

        char[] firstArray = text.toCharArray();
        char[] encrypted = wordEncrypted(shift, firstArray);

        System.out.println("Ihr Wort verschlüsselt:");

        for (int i = 0; i < encrypted.length; i++) {
            System.out.println(encrypted[i]);
        }

        } else System.out.println("Die Verschiebung der Wörter liegt nur zwischen 1 - 15");


        public static char[] wordEncrypted ( int offset, char[] charArray){

            char[] arrayEncrypted = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                int shifted = (charArray[i] + offset);
                arrayEncrypted[i] = (char) (shifted);

            }
        }


    }


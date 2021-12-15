package at.jonathan.stringUebungen.stringHelper;

public class Palindrome {
    public static void main(String[] args) {

        //Example for Palindrom: mom, dad, rotor, race car

        String originalText = "race car";
        originalText = originalText.replace(" ", "");

        String reverseText = "";
        for (int i = originalText.length() - 1; i >= 0; i--) {
            reverseText += originalText.charAt(i);
            System.out.println(reverseText);
        }

        boolean palindrome = true;
        for (int i = 0; i < originalText.length(); i++) {
            if (originalText.charAt(i) != reverseText.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("Es ist ein Palindrom!");
        } else {
            System.out.println("Es ist kein Palindrom!");
        }
    }


}

package at.jonathan.stringUebungen.stringHelper;

public class ReverseString {
    public static void main(String[] args) {

        String originalText = "Einfach hingeklatscht";
        String reverseText = "";

        for (int i = originalText.length() - 1; i >= 0; i--) {
            reverseText += originalText.charAt(i);
            System.out.println(reverseText);
        }

    }
}

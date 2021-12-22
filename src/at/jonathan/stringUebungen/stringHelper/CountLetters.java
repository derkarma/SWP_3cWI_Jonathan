package at.jonathan.stringUebungen.stringHelper;

public class CountLetters {
    public static void main(String[] args) {

        String text = "Es wird alles gezählt sogar ohne Leerzeichen";
        text = text.replace(" ", "");

        int textLength = text.length();
            System.out.println(textLength);

    }


}




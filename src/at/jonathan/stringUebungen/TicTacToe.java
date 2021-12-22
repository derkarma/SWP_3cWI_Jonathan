package at.jonathan.stringUebungen;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] playGround = {{' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '}};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie an wo Sie setzen möchten (1-9)");
        int position = scanner.nextInt();
        System.out.println(position);


        printPlayGround(playGround);
    }

    public static void printPlayGround(char[][] playGround) {
        for (char[] row : playGround) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void palcePiece(char[][] playGround, int position, String user) {
        switch (position) {
            case 1:
                playGround[0][0] = 'X';
                break;
            case 2:
                playGround[0][2] = 'X';
                break;
            case 3:
                playGround[0][4] = 'X';
                break;
            case 4:
                playGround[2][0] = 'X';
                break;
            case 5:
                playGround[2][2] = 'X';
                break;
            case 6:
                playGround[2][4] = 'X';
                break;
            case 7:
                playGround[4][0] = 'X';
                break;
            case 8:
                playGround[4][2] = 'X';
                break;
            case 9:
                playGround[4][4] = 'X';
                break;
        }
    }

}
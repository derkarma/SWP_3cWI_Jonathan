package at.jonathan.stringUebungen.arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[] throwsArray = new int[6];
        throwsArray[4] = 9;

        for (int i = 0; i < throwsArray.length; i++) {
            System.out.print(throwsArray[i] + "");

        }

        int[][] playground = new int[3][3];
        playground[0][0] = 1;
        playground[2][1] = 2;
        System.out.println("--------------------------");
        for (int row = 0; row < playground.length; row++) {
            for (int col = 0; col < playground.length; col++) {
                System.out.print(playground[row][col] + "");

            }
            System.out.println();

        }

    }
}

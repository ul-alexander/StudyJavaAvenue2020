package Lesson4;

public class ArraysUtils {

    public static void printDoubleArray(int[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int i2 = 0; i2 < arrayToPrint[i].length; i2++) {
                System.out.print(arrayToPrint[i][i2] + " ");
            }
            System.out.println();
        }
    }

    public static void printDoubleArray(char[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int i2 = 0; i2 < arrayToPrint[i].length; i2++) {
                System.out.print(arrayToPrint[i][i2] + " ");
            }
            System.out.println();
        }
    }
}

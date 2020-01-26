package Lesson4;

public class Main2 {
    public static void main(String[] args) {
        int[][] array = new int[5][6];


        System.out.print(array[0][0] + " ");
        System.out.print(array[0][1] + " ");
        System.out.print(array[0][2] + " ");
        System.out.print(array[0][3] + " ");
        System.out.println();

        System.out.print(array[0][0] + " ");
        System.out.print(array[1][1] + " ");
        System.out.print(array[1][2] + " ");
        System.out.print(array[1][3] + " ");
        System.out.println();

        System.out.print(array[2][0] + " ");
        System.out.print(array[2][1] + " ");
        System.out.print(array[2][2] + " ");
        System.out.print(array[2][3] + " ");
        System.out.println();

        System.out.println("================================");
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array[i].length; i2++) {
                System.out.print(array[i][i2] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array[i].length; i2++) {
                if (i >= i2) {
                    System.out.print(array[i][i2] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println("==============================");
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i >= i2; i2++) {
                System.out.print(array[i][i2] + " ");

            }
            System.out.println();
        }
    }
}

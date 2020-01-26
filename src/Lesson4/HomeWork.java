package Lesson4;

public class HomeWork {
    public static void main(String[] args) {
        /*
        Using the for loop:
        1) fill a two-dimensional array like this: https://www.screencast.com/t/PQbxr9Ov and bring it to the console
        2) output to the console like this: https://www.screencast.com/t/lmsyy9B2 , from the same two-dimensional array
        3) output to the console like this: https://www.screencast.com/t/hIdmBFjp , from the same array
        */

        //base array
        int[][] array = new int[5][5];

        //task 1
        //прокрутка 1 массива
        for (int i = 0; i < array.length; i++) {
            //прокрутка 2 массива
            for (int i2 = 0; i2 < array[i].length; i2++) {
                //заполнение массива
                if (i == i2) {
                    array[i][i2] = 1;
                }
                //вывод ячейки массива
                System.out.print(array[i][i2] + " ");
            }
            //перенос строки
            System.out.println();
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        //task 2
        //прокрутка 1 массива
        for (int i = 0; i < array.length; i++) {
            //прокрутка 2 массива
            for (int i2 = 0; i2 < array[i].length; i2++) {
                if (i == i2) {
                    //вывод ячейки массива
                    System.out.print(array[i][i2] + " ");
                } else {
                    //вывод 2х пробелов
                    System.out.print("  ");
                }
            }
            //перенос строки
            System.out.println();
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        //task 3
        //прокрутка 1 массива
        for (int i = 0; i < array.length; i++) {
            //прокрутка 2 массива
            for (int i2 = array[i].length; 0 < i2 + 1; i2--) {

                int temp = i / 2 + 1;

                if (i2 == i && i != temp) {

                    //Перезапись массива
                    array[i][i2] = 0;
                    //вывод ячейки массива
                    System.out.print(array[i][i2] + " ");
                } else if (i2 == i) {
                    //вывод ячейки массива
                    System.out.print(array[i][i2] + " ");
                } else {
                    //вывод 2х пробелов
                    System.out.print("  ");
                }

            }
            //перенос строки
            System.out.println();
        }
    }
}

package Lesson3;

public class Main1 {
    public static void main(String[] args) {

        int[] array2 = new int[10];
        int[] array = {2, 6, 4, 8, 5};

        System.out.println(array[2]);

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
        //=================================

        for (int val : array) {

            System.out.println(val);
        }
    }
}

package Lesson3;

public class HomeWork {
    /*
    1) There is an array {a, b, c, d}. With the help cycle "for" need print on console on waiting lists,on one dreaded.
    2) There is an array {a, b, c, d}. You need to " turn it backwards."
       The result will be another array. And after that, print the second array to the console for demonstration.
    3) There is an array of numbers (set it yourself).
       The task is to calculate and print on the console the sum of all even digits inside this array.
    4) Finish the task with a password
    */

    public static void main(String[] args) {

        //Task 1)
        String[] arrayTest1 = {"A", "B", "C", "D"};

        for (int i = 0; i < arrayTest1.length; i++) {

            System.out.println("Содержание массива : " + arrayTest1[i]);

        }

        //Task 2)
        String[] arrayTest2 = {"A", "B", "C", "D"};
        String[] replaceArray = new String[4];
        int counter = 0;
        //Зоздание и сохранение массива задам наперед.
        for (int i = arrayTest2.length - 1; i >= 0; i--) {
            replaceArray[counter] = arrayTest2[i];
            counter++;
        }
        //вывод для демонстрации
        for (String val : replaceArray) {
            System.out.println("Содержание массива : " + val);

        }

        //Task 3)
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int sum = 0;
        for (int val : numbers) {
            if (val % 2 == 0) {
                sum = sum + val;
            }
        }

        System.out.println(sum);
    }
}

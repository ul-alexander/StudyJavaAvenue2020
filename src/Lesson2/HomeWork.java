package Lesson2;

public class HomeWork {
    public static void main(String[] args) {

        /*

        Using the "for" loop" :

        a) print numbers from 0 to -20 on the console
        b) display numbers on the console in the range from 500 to 1000, which are divided without remainder by 7 and 19
        с) display on the console the sum of numbers in the range from 50 to 1000, which are divided without remainder by 7 and 19
        d) to print on the console numbers from 10 to 30, thus not to print numbers: 21,22,23,24
        e) print the numbers from 90 to 100 on the console in reverse order

        */

        //Task a:
        System.out.println("========================");
        System.out.println("Задача А");
        for (int i = 0; i != -21; i--) {
            System.out.println("Задача а :   " + i);
        }

        //Task b:
        System.out.println("========================");
        System.out.println("Задача Б");
        for (int i = 500; i <= 1000; i++) {
            if (i % 7 == 0) {
                System.out.println("Числа делящиеся без остатка на 7 :" + i);
            } else if (i % 19 == 0) {
                System.out.println("Числа делящиеся без остатка на 19 :" + i);
            }

        }
        //Task c:
        System.out.println("========================");
        System.out.println("Задача С");
        int sum = 0;
        for (int i = 50; i <= 1000; i++) {

            if (i % 7 == 0 && i % 19 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
        //Task d:
        System.out.println("========================");
        System.out.println("Задача D");

        //Массив Чисел Исключений
        int[] exeptionOfNumber = {21, 22, 23, 24};
        //перебор и вывод
        for (int i = 10; i <= 30; i++) {
            //Временная переменная
            int tempNumber = 0;

            //перебор массива чисел которые нельзя выводить
            for (int val : exeptionOfNumber) {

                if (val == i) {
                    //присваивание во временную переменную
                    tempNumber = val;
                }
            }
            //вывод
            if (i != tempNumber) {
                System.out.println(i);
            }
        }

        //Task e:
        System.out.println("========================");
        System.out.println("Задача E");

        for (int i = 100; i >= 90; i--) {
            System.out.println(i);
        }

    }
}

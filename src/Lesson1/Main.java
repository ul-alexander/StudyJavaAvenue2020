package Lesson1;

public class Main {
    public static void main(String[] args) {

        int a = 1231;
        int b = 2222;

        int number = 7;
        int ostatokOtDeleniya = number % 2;

        if (ostatokOtDeleniya == 0) {
            System.out.println("Число поделено поровну");
        }

        if (ostatokOtDeleniya != 0) {
            System.out.println("Число не поделено поровну");
        }

        if (ostatokOtDeleniya == 0) {
            System.out.println("Число поделено поровну");
        } else {
            System.out.println("Число не поделено поровну");
        }
    }
}

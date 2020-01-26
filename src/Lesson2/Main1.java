package Lesson2;

public class Main1 {
    public static void main(String[] args) {

        int a = 4;
        int b = 4;
        int c = 4;

        if (a == b && b == c) {
            System.out.println("Это равностороний треугольник");
        } else if (a != b || b != c || c != a) {
            System.out.println("Это разностороний треугольник");
        } else {
            System.out.println("Это равнобедреный треугольник");

        }
    }
}

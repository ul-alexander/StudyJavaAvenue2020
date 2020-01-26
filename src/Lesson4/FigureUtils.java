package Lesson4;

public class FigureUtils {

    // 1 - модификатор доступа ( 4 варианта)
    // 2 - возвращаем тип ( void - без возврата , либо String , int и так далее ююю
    // 3 - название метода ( придумываем сами , максимально точно)
    // 4 - входящие параметры:

    public static void printTypeOfTriangle(int storonaA, int storonaB, int storonaC) {

        if (storonaA == storonaB && storonaB == storonaC) {
            System.out.println("Это равностороний треугольник");
        } else if (storonaA != storonaB || storonaB != storonaC || storonaC != storonaB) {
            System.out.println("Это разностороний треугольник");
        } else {
            System.out.println("Это равнобедреный треугольник");
        }

    }
}

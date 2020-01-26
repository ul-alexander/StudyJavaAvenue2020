package Lesson6;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    private String color;

    //Переменные
    //Конструктор
    //Методы

    public void setColor(String color) {

    }


    public void setSideA(int sideA) {

        this.sideA = sideA;
    }

    public void setSideB(int sideB) {

        sideA = sideB;
    }

    public void setSideC(int sideC) {

        sideA = sideC;
    }

    public void print() {
        System.out.printf("Треугольник со сторонами: %d, %d , %d", this.sideA, this.sideB, this.sideC);
    }


    public int perimetr() {
        return this.sideA + this.sideB + this.sideC;
    }

}

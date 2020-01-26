package Lesson6.HomeWork;

public class Rectangle {

    private int sideA;
    private int sideB;

    public void setSideA(String sideA) {
        this.sideA = Integer.parseInt(sideA);
    }

    public void setSideB(String sideB) {
        this.sideB = Integer.parseInt(sideB);
    }

    public void printPerimeter() {

        System.out.println("Периметр прямоугольника равен : " + (this.sideA + this.sideB) * 2);
    }

    public void printArea() {
        System.out.println("Площадь прямоугольника равна : " + this.sideA * this.sideB);
    }
}

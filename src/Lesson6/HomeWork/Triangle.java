package Lesson6.HomeWork;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public void setSideA(String sideA) {
        this.sideA = Integer.parseInt(sideA);
    }

    public void setSideB(String sideB) {
        this.sideB = Integer.parseInt(sideB);
    }

    public void setSideC(String sideC) {
        this.sideC = Integer.parseInt(sideC);
    }

    public void printPerimeter() {
        System.out.println("Периметр треугольника равен : " + (this.sideA + this.sideB + this.sideC));
    }

    public void printArea() {

        int p = (this.sideA + this.sideB + this.sideC) / 2;
        double s = Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
        System.out.println("Площадь треугольника равна : " + s);
    }
}

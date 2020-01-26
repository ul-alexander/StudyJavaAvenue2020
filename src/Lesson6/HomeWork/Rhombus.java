package Lesson6.HomeWork;

public class Rhombus {

    private double rhombusDiagonal1;
    private double rhombusDiagonal2;
    private double rhombusPerimeter;
    private double rhombusArea;


    public void setRhombusDiagonal1(String rhombusDiagonal1) {

        this.rhombusDiagonal1 = Double.parseDouble(rhombusDiagonal1);
    }

    public void setRhombusDiagonal2(String rhombusDiagonal2) {

        this.rhombusDiagonal2 = Double.parseDouble(rhombusDiagonal2);
    }

    public void printPerimeter() {

        this.rhombusPerimeter = Math.sqrt(Math.pow(this.rhombusDiagonal1 / 2, 2) + Math.pow(this.rhombusDiagonal2 / 2, 2)) * 4;
        System.out.println("Периметр ромба равен : " + this.rhombusPerimeter);
    }

    public void printArea() {

        this.rhombusArea = (this.rhombusDiagonal1 * this.rhombusDiagonal2) / 2;
        System.out.println("Площадь ромба равна : " + rhombusArea);
    }

}

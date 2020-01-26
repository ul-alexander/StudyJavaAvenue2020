package Lesson6.HomeWork;

public class Circle {

    private double radius;
    private double circlePerimeter;
    private double circleArea;


    public void setRadius(String radius) {
        this.radius = Double.parseDouble(radius);
    }

    public void printPerimeter() {
        this.circlePerimeter = (Math.PI *this.radius) + (Math.PI * this.radius);
        System.out.println();
        System.out.println("Периметр круга : " + this.circlePerimeter);
    }

    public void printArea() {

        this.circleArea = Math.PI * (this.radius * this.radius);
        System.out.println();
        System.out.println("Площадь круга : " + this.circleArea);
    }


}

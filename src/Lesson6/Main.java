package Lesson6;

import Lesson6.HomeWork.Circle;
import Lesson6.HomeWork.Rectangle;
import Lesson6.HomeWork.Rhombus;
import Lesson6.HomeWork.Triangle;

import java.util.Scanner;

public class Main {


    //method check user answer
    //===========================================
    private static boolean checkUserAnswer(String userAnswer) {

        userAnswer = userAnswer.trim().toLowerCase();

        if (userAnswer.equals("yes")) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }


    }
    //===========================================

    public static void main(String[] args) {


        //Triangle treyq1 = new Triangle();
        //=========================================
        //Homework
        //new object keyboard
        Scanner keyboard = new Scanner(System.in);


        //Task 1 circle
        System.out.println();
        System.out.println("=========================");
        System.out.println("Print perimeter and area for circle ?");
        System.out.println();
        //================================================
        System.out.print("write yes please : ");
        if (checkUserAnswer(keyboard.nextLine())) {
            //new object
            Circle circle = new Circle();
            //in number
            System.out.print("write radius please : ");
            circle.setRadius(keyboard.nextLine());
            //print Perimeter
            circle.printPerimeter();
            //print Area
            circle.printArea();
        }
        //Task 2 rhombus
        System.out.println();
        System.out.println("=========================");
        System.out.println("Print perimeter and area for rhombus ?");
        System.out.println();
        //================================================
        System.out.print("write yes please : ");
        if (checkUserAnswer(keyboard.nextLine())) {
            //new object
            Rhombus rhombus = new Rhombus();
            //inter number for side
            System.out.print("write diagonal 1 : ");
            rhombus.setRhombusDiagonal1(keyboard.nextLine());
            //inter number for corner
            System.out.print("write diagonal 2 : ");
            rhombus.setRhombusDiagonal2(keyboard.nextLine());
            //print Perimeter
            rhombus.printPerimeter();
            //print Area
            rhombus.printArea();
        }
        //Task 3 rectangle
        System.out.println();
        System.out.println("=========================");
        System.out.println("Print perimeter and area for rectangle ?");
        System.out.println();
        //================================================
        System.out.print("write yes please : ");
        if (checkUserAnswer(keyboard.nextLine())) {
            //new object
            Rectangle rectangle = new Rectangle();
            //side a
            System.out.print("write side A : ");
            rectangle.setSideA(keyboard.nextLine());
            //side b
            System.out.print("write side B : ");
            rectangle.setSideB(keyboard.nextLine());
            //print perimeter
            rectangle.printPerimeter();
            //print area
            rectangle.printArea();

        }
        //Task 4 Triangle
        System.out.println();
        System.out.println("=========================");
        System.out.println("Print perimeter and area for triangle ?");
        System.out.println();
        //================================================
        System.out.print("write yes please : ");
        if (checkUserAnswer(keyboard.nextLine())) {
            //new object
            Triangle triangle = new Triangle();
            //side a
            System.out.print("write side A : ");
            triangle.setSideA(keyboard.nextLine());
            //side b
            System.out.print("write side B : ");
            triangle.setSideB(keyboard.nextLine());
            //side c
            System.out.print("write side C : ");
            triangle.setSideC(keyboard.nextLine());
            //print perimeter
            triangle.printPerimeter();
            //print area
            triangle.printArea();

        }


    }
}

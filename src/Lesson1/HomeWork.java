package Lesson1;

public class HomeWork {
    public static void main(String[] args) {

        /*
         Task 1: given the length of the room, width of room,
         length of table, width of table values (specify your own).
         You need to count how many tables will fit in the room.
         */

        char m2 = '²';
        String metr2 = " м" + m2;

        //Комната
        double lengthRoom = 17.0;
        double widthRoom = 8.0;

        //Стол
        double lengthTable = 5.0;
        double widthTable = 3.0;

        //Площади стола и комнаты
        double areaRoom = lengthRoom * widthRoom;
        double areaTable = lengthTable * widthTable;

        //сколько столов влезет
        int countTableLength = (int) (lengthRoom / lengthTable);
        int countTableWidth = (int) (widthRoom / widthTable);
        int countTableTotal = countTableLength * countTableWidth;

        //результат
        System.out.println("===================================");
        System.out.println("Площадь комнаты : " + areaRoom + metr2);
        System.out.println("Площадь стола : " + areaTable + metr2);
        System.out.println("===================================");
        System.out.println("Столов поместилось : " + countTableTotal + " шт");
        System.out.println("Столы в ширину : " + countTableWidth + " шт");
        System.out.println("Столы в длинну : " + countTableLength + " шт");

        /*
         Task 2: given 3 sides of the triangle (themselves set the sides of an arbitrary value).
         You need to calculate the area of the triangle and display the result on the console.
         */

        //Стороны треугольника

        double sideTriangle1 = 4.2;
        double sideTriangle2 = 5.7;
        double sideTriangle3 = 6;

        // Расчет
        double sumSides = sideTriangle1 + sideTriangle2 + sideTriangle3;
        double areaTriangle = sumSides / 2;

        System.out.println("===================================");
        System.out.println("Площадь треугольника : " + areaTriangle + " см");
        System.out.println("===================================");
    }
}

package Lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        String[][] toursBase = {
                {"1", "Италия", "25000", "2 включено"},
                {"2", "франция", "35000", "4 включено"},
                {"3", "Бельгия", "66000", "6 включено"},
                {"4", "Япония", "5000", "1 включено"},
                {"5", "Германия", "100000", "7 включено"}};

//        System.out.println("В какую страну хотите поехать ?");
//        Scanner keyboard = new Scanner(System.in);
//        String inputCountry = keyboard.nextLine();
//        System.out.println(inputCountry);
//        ToursUtils.printToursByCountry(toursBase, inputCountry);

        System.out.println("Сколько вы готовы заплатить за поездку ?");


        Scanner keyboard = new Scanner(System.in);


        System.out.print("Введите минемальную цену: ");
        int minCoast = keyboard.nextInt();

        System.out.print("Введите максимальную цену: ");
        int maxCoast = keyboard.nextInt();

        ToursUtils.printToursByMinMaxCoast(toursBase, minCoast, maxCoast);


    }
}

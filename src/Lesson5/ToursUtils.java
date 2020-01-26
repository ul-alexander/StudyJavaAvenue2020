package Lesson5;

import java.lang.reflect.Array;

public class ToursUtils {

    public static void printToursByCountry(String[][] toursBase, String inputCountry) {

        for (int i = 0; i < toursBase.length; i++) {
            if (inputCountry.equals(toursBase[i][1])) {
                System.out.printf("Тур: %s - %s , цена - %s , %s", toursBase[i][0], toursBase[i][1], toursBase[i][2], toursBase[i][3]);
                System.out.println();
            }
        }

    }

    public static void printToursByMinMaxCoast(String[][] toursBase, int minCoast, int maxCoast) {

        for (int i = 0; i < toursBase.length; i++) {

            int tourCost = Integer.parseInt(toursBase[i][2]);

            if (tourCost >= minCoast && tourCost < maxCoast) {

                System.out.printf("Тур: %s - %s , цена - %s , %s", toursBase[i][0], toursBase[i][1], toursBase[i][2], toursBase[i][3]);
                System.out.println();
            }

        }

    }


    public static void printToursByLowHighStars(String[][] tourBase, int lowStars, int highStars) {

        System.out.println();
        System.out.println("======================");
        System.out.println();

        for (int i = 0; i < tourBase.length; i++) {

            //tours sort

            if (lowStars <= Integer.parseInt(tourBase[i][3]) && highStars >= Integer.parseInt(tourBase[i][3])) {


                System.out.printf("Тур № %s , Страна: - %s , цена - %s , Количество звезд: %s , Питание : %s", tourBase[i][0], tourBase[i][1], tourBase[i][2], tourBase[i][3], tourBase[i][4]);
                System.out.println();

            }
        }
    }


    public static void printToursByCheapOrExpensive(String[][] tourBase, boolean expensive, boolean cheap) {

        //Price roll 2

        int coastExpensive = 0;
        int coastCheap = 0;

        //Expensive Tour
        for (int i = 0; i < tourBase.length; i++) {
            if (Integer.parseInt(tourBase[i][2]) >= coastExpensive) {
                coastExpensive = Integer.parseInt(tourBase[i][2]);
            }
        }

        //CheapTour
        coastCheap = coastExpensive;

        for (int i = tourBase.length - 1; i > 0; i--) {
            if (coastCheap > Integer.parseInt(tourBase[i][2])) {
                coastCheap = Integer.parseInt(tourBase[i][2]);
            }
        }

        //answer expensive
        if (expensive) {
            for (int i = 0; i < tourBase.length; i++) {
                if (coastExpensive == Integer.parseInt(tourBase[i][2])) {
                    System.out.printf("Тур № %s , Страна: - %s , цена - %s , Количество звезд: %s , Питание : %s", tourBase[i][0], tourBase[i][1], tourBase[i][2], tourBase[i][3], tourBase[i][4]);
                    System.out.println();
                }
            }
        }

        //answer cheap
        if (cheap) {
            for (int i = 0; i < tourBase.length; i++) {
                if (coastCheap == Integer.parseInt(tourBase[i][2])) {
                    System.out.printf("Тур № %s , Страна: - %s , цена - %s , Количество звезд: %s , Питание : %s", tourBase[i][0], tourBase[i][1], tourBase[i][2], tourBase[i][3], tourBase[i][4]);
                    System.out.println();
                }
            }
        }

    }

    public static void printAveragePriceAndTour(String[][] tourBase, String country) {

        int countPrices = 0;
        int countCountry = 0;
        country = country.toLowerCase().trim();

        for (int i = 0; i < tourBase.length; i++) {

            if (tourBase[i][1].toLowerCase().trim().equals(country)) {
                countPrices = countPrices + Integer.parseInt(tourBase[i][2]);
                countCountry = countCountry + 1;
            }
        }

        //average price
        System.out.println();
        System.out.println("Average price of tour for country " + country + " : " + countPrices / countCountry);

    }

    /*
    HomeWork

    1 - Напечатать самый дорогой тур
    2 - все туры от ... звезд до ... звезд в страну
    3 - самый дешевый тур ... в страну
    4 - средняя стоимость тура в ... страну
     * */

}

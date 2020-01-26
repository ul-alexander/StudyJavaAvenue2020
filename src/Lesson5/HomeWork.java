package Lesson5;

import java.util.Scanner;


public class HomeWork {
    public static void main(String[] args) {

        String[][] tourBase = {
                {"0", "Italy", "20000", "3", "All in"},
                {"1", "Spain", "25000", "3", "All in"},
                {"2", "France", "50000", "5", "All in"},
                {"3", "Germany", "40000", "4", "All in"},
                {"4", "Russia", "5000", "2", "All in"},
                {"5", "USA", "90000", "5", "All in"},
                {"16", "USA", "30000", "1", "All in"},
                {"6", "Canada", "34000", "3", "All in"},
                {"7", "Sweden", "55000", "4", "All in"},
                {"8", "Turkey", "15000", "2", "All in"},
                {"9", "Thailand", "80000", "5", "All in"},
                {"10", "India", "60000", "5", "All in"},
                {"11", "India", "3000", "1", "All in"},
                {"12", "India", "33000", "3", "All in"},
                {"13", "India", "77700", "4", "All in"},
                {"14", "India", "85000", "5", "All in"},
                {"15", "India", "23000", "2", "All in"},
        };

        Scanner keyboard = new Scanner(System.in);
        String userAnswer = "";

        //Task 1
        System.out.println();
        System.out.println("=========================");
        System.out.println("Print best expensive tour ?");
        System.out.println();

        System.out.print("Write yes please : ");
        userAnswer = keyboard.nextLine();
        userAnswer = userAnswer.toLowerCase().trim();

        if (userAnswer.equals("yes")) {
            ToursUtils.printToursByCheapOrExpensive(tourBase, true, false);
        } else {
            System.out.println("Ok , no problem , next question...");
        }

        userAnswer = "";

        //Task2
        System.out.println();
        System.out.println("=========================");
        System.out.println("Print hotels with low and high stars ?");
        System.out.println();

        System.out.print("Write yes please : ");
        userAnswer = keyboard.nextLine();
        userAnswer = userAnswer.toLowerCase().trim();

        if (userAnswer.equals("yes")) {
            //low stars
            System.out.print("Write number of low stars : ");
            int lowStars = Integer.parseInt(keyboard.nextLine());
            //high stars
            System.out.print("Write number of high stars : ");
            int highStars = Integer.parseInt(keyboard.nextLine());

            //result
            ToursUtils.printToursByLowHighStars(tourBase, lowStars, highStars);

        } else {
            System.out.println("Ok , no problem , next question...");
        }
        userAnswer = "";

        //Task 3
        System.out.println();
        System.out.println("=========================");
        System.out.println("Print best cheap tour ?");
        System.out.println();

        System.out.print("Write yes please : ");
        userAnswer = keyboard.nextLine();
        userAnswer = userAnswer.toLowerCase().trim();

        if (userAnswer.equals("yes")) {
            ToursUtils.printToursByCheapOrExpensive(tourBase, false, true);
        } else {
            System.out.println("Ok , no problem , next question...");
        }
        userAnswer = "";

        //Task 3
        System.out.println();
        System.out.println("=========================");
        System.out.println("Print average price of tour ?");
        System.out.println();

        System.out.print("Write yes please : ");
        userAnswer = keyboard.nextLine();
        userAnswer = userAnswer.toLowerCase().trim();

        if (userAnswer.equals("yes")) {

            System.out.print("Write please a country: ");
            String country = keyboard.nextLine();

            ToursUtils.printAveragePriceAndTour(tourBase, country);
            System.out.println();
            System.out.println("Thanks for leaning my homework , Goodbye Natalya");
        } else {
            System.out.println("Ok , no problem , it is last task , Goodbye Natalya");
        }

    }
}

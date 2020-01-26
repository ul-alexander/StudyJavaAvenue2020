package Lesson12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Важные особенности
        // - Нельзя сделать дубликаты
        // - Не имеет ключей

        //Хранение Сложных типов
        // Линкед значит друг за другом
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Cherry");
        fruits.add("Pear");

        //Хранение Примитивных типов
        //Без линкед значит в случайном порядке
        HashSet<Double> chisloDouble = new HashSet<>();
        chisloDouble.add(3.3);
        chisloDouble.add(3.2);
        chisloDouble.add(3.1);
        chisloDouble.add(2.3);
        chisloDouble.add(2.0);

        //Сортировка TreeSet по бинарному дереву (влево или вправо)
        // от носительно первых входных данных в данном случае 8
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(8);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);


        //Print Fruits
        System.out.println(fruits);
        //Print Double
        System.out.println(chisloDouble);
        //Print TreeSet сортировку
        System.out.println(numbers);
    }
}

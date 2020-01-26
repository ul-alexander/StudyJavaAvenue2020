package Lesson12;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {

    //Точка старта
    public static void main(String[] args) {

        //Создание Монет
        Coin coin1 = new Coin(2.0, 2011, 10);
        Coin coin2 = new Coin(2.0, 2011, 10);
        Coin coin3 = new Coin(3, 2015, 5);
        Coin coin4 = new Coin(1.1, 2018, 20);
        Coin coin5 = new Coin(5.6, 1989, 6);
        Coin coin6 = new Coin(5.6, 1989, 7);
        Coin coin7 = new Coin(4.5, 1989, 7);


        //Создаем коллекцию без ключей HashSet (Пакет с монетами)

        //HashSet<Coin> coins = new HashSet<>();
        //Сортировка по году
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);
        coins.add(coin7);

        //System.out.println(coins);

        //Вывод списком в цыкле
        for (Coin coin : coins) {
            System.out.println(coin);
        }
    }

}

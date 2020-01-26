package Lesson11;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class KolodaCards {

    private ArrayList<Card> cards = new ArrayList<>();

    public KolodaCards() {
    }

    public void initKolodaCards() {
        cards.add(new Card("Пика", "2", 2));
        cards.add(new Card("Крести", "2", 2));
        cards.add(new Card("Бубна", "2", 2));
        cards.add(new Card("Черви", "2", 2));

        cards.add(new Card("Пика", "3", 3));
        cards.add(new Card("Крести", "3", 3));
        cards.add(new Card("Бубна", "3", 3));
        cards.add(new Card("Черви", "3", 3));

        cards.add(new Card("Пика", "4", 4));
        cards.add(new Card("Крести", "4", 4));
        cards.add(new Card("Бубна", "4", 4));
        cards.add(new Card("Черви", "4", 4));

        cards.add(new Card("Пика", "5", 5));
        cards.add(new Card("Крести", "5", 5));
        cards.add(new Card("Бубна", "5", 5));
        cards.add(new Card("Черви", "5", 5));

        cards.add(new Card("Пика", "6", 6));
        cards.add(new Card("Крести", "6", 6));
        cards.add(new Card("Бубна", "6", 6));
        cards.add(new Card("Черви", "6", 6));

        cards.add(new Card("Пика", "7", 7));
        cards.add(new Card("Крести", "7", 7));
        cards.add(new Card("Бубна", "7", 7));
        cards.add(new Card("Черви", "7", 7));

        cards.add(new Card("Пика", "8", 8));
        cards.add(new Card("Крести", "8", 8));
        cards.add(new Card("Бубна", "8", 8));
        cards.add(new Card("Черви", "8", 8));

        cards.add(new Card("Пика", "9", 9));
        cards.add(new Card("Крести", "9", 9));
        cards.add(new Card("Бубна", "9", 9));
        cards.add(new Card("Черви", "9", 9));

        cards.add(new Card("Пика", "10", 10));
        cards.add(new Card("Крести", "10", 10));
        cards.add(new Card("Бубна", "10", 10));
        cards.add(new Card("Черви", "10", 10));

        cards.add(new Card("Пика", "Валет", 10));
        cards.add(new Card("Крести", "Валет", 10));
        cards.add(new Card("Бубна", "Валет", 10));
        cards.add(new Card("Черви", "Валет", 10));

        cards.add(new Card("Пика", "Дама", 10));
        cards.add(new Card("Крести", "Дама", 10));
        cards.add(new Card("Бубна", "Дама", 10));
        cards.add(new Card("Черви", "Дама", 10));

        cards.add(new Card("Пика", "Король", 10));
        cards.add(new Card("Крести", "Король", 10));
        cards.add(new Card("Бубна", "Король", 10));
        cards.add(new Card("Черви", "Король", 10));

        cards.add(new Card("Пика", "Туз", 11));
        cards.add(new Card("Крести", "Туз", 11));
        cards.add(new Card("Бубна", "Туз", 11));
        cards.add(new Card("Черви", "Туз", 11));

    }

    public Card getRandomCard() {

        int randomNumber = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return this.cards.get(randomNumber);
    }
}

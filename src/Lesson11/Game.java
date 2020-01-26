package Lesson11;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    private KolodaCards cards;
    private LinkedList<Player> players = new LinkedList<>();

    //start game constructor
    public Game() {
        KolodaCards cards = new KolodaCards();
        cards.initKolodaCards();
        this.setCards(cards);
    }

    //add card
    public void setCards(KolodaCards cards) {
        this.cards = cards;
    }

    //add player
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    //pervui raund
    public void doFirstRound() {

        for (int i = 0; i < 2; i++) {
            for (Player player : this.players) {
                player.addCardToHand(cards.getRandomCard());
            }
        }
    }

    //vuvod ruki igroka
    public void printPlayersHand() {
        for (Player player : this.players) {
            if (!player.isDealer()) {
                player.printHand();
            }
        }
    }

    //vuvod ruki igroka
    public void printAllPlayersHand() {
        for (Player player : this.players) {
            player.printHand();
        }
    }

    //razdacha kart
    public void doActionPlayers() {
        for (Player player : this.players) {
            if (!player.isDealer()) {
                //в то время как игрок нуждается в картах , игрок возьми карту
                while (player.isNeedCard()) {
                    player.takeCard(this.cards);
                    player.printHand();
                }
            }
        }
    }

    //logika krupe
    public void doActionDealer() {
        for (Player player : this.players) {
            if (player.isDealer()) {
                player.takeCard(this.cards);
            }
        }
    }

    public void printWinner() {

        for (Player player : this.players) {
            if (!player.isDealer()) {
                //общее число карт
                int values = player.getValueHand();
                if (values > 21) {
                    player.setWinner(false);
                }

            }
        }

        if (this.getCountWinners() == 1) {
            System.out.println("========================");
            System.out.println("=========WINNER=========");
            for (Player player : this.players) {
                if (player.isWinner()) {
                    player.printHand();
                    //exit
                    return;
                }
            }
        }

        for (int i = 21; i > 4; i--) {
            int win = 0;
            for (Player player : players) {
                if (player.getValueHand() == i) {
                    System.out.println("========================");
                    System.out.println("=========WINNER=========");
                    player.printHand();
                    win++;
                }
            }
            if (win != 0) {
                return;
            }
        }
    }

    private int getCountWinners() {
        int sum = 0;
        for (Player player : this.players) {
            if (player.isWinner()) {
                sum++;
            }
        }
        return sum;
    }

}

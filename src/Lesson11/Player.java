package Lesson11;

import java.util.LinkedList;
import java.util.Scanner;

public class Player {

    private LinkedList<Card> hand = new LinkedList<>();
    private boolean isDealer = false;
    private boolean isNeedCard = true;
    private boolean isWinner = true;
    private String playerName;

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public boolean isNeedCard() {
        return isNeedCard;
    }

    public void setNeedCard(boolean needCard) {
        isNeedCard = needCard;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }

    public void addCardToHand(Card card) {

        this.hand.add(card);

    }

    public void printHand() {
        System.out.println("Карты пользователя : " + this.playerName);
        System.out.println("_______________________");
        for (Card card : this.hand) {
            System.out.println(card);
        }
        System.out.println("_______________________");
        System.out.println();
        System.out.println("============================");
    }

    public void takeCard(KolodaCards card) {
        //question
        System.out.println("Пользователь : " + this.playerName + " вам нужна еще карта ?");
        System.out.println();
        System.out.println("У вас сейчас : " + this.getValueHand() + " очков");
        //start keyboard
        Scanner keyboard = new Scanner(System.in);
        //save text from keyboard
        String answer = keyboard.nextLine();
        //if else
        if (answer.equals("да")) {
            this.addCardToHand(card.getRandomCard());
        } else if (answer.equals("нет")) {
            this.setNeedCard(false);
        } else {
            System.out.println("Ошибка! напишите да или нет");
            this.takeCard(card);
        }
    }

    public int getValueHand() {
        int sum = 0;
        for (Card card : this.hand) {
            sum = sum + card.getCardValue();
        }
        return sum;
    }

}
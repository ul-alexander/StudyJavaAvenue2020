package Lesson11;

public class Card {

    private String cardMast;
    private String cardNominal;
    private int cardValue;

    public Card() {
    }

    public Card(String cardMast, String cardNominal, int cardValue) {
        this.cardMast = cardMast;
        this.cardNominal = cardNominal;
        this.cardValue = cardValue;
    }

    public String getCardMast() {
        return cardMast;
    }

    public void setCardMast(String cardMast) {
        this.cardMast = cardMast;
    }

    public String getCardNominal() {
        return cardNominal;
    }

    public void setCardNominal(String cardNominal) {
        this.cardNominal = cardNominal;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getCardValue() != card.getCardValue()) return false;
        if (!getCardMast().equals(card.getCardMast())) return false;
        return getCardNominal().equals(card.getCardNominal());
    }

    @Override
    public int hashCode() {
        int result = getCardMast().hashCode();
        result = 31 * result + getCardNominal().hashCode();
        result = 31 * result + getCardValue();
        return result;
    }

    @Override
    public String toString() {
        return "Карта: " + this.cardNominal + " " + this.cardMast;
    }
}

package Lesson11;

public class Dealer extends Player {
    @Override
    public void takeCard(KolodaCards card) {
        int valuesCard = this.getValueHand();
        //Dealer level
        if (valuesCard < 19) {
            this.addCardToHand(card.getRandomCard());
            this.takeCard(card);
        }
    }
}

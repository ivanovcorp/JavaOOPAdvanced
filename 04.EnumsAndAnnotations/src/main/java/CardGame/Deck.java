package CardGame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Deck {

    private Set<Card> cards;
    private List<String> possibleCards;

    public Deck() {
        this.cards = new HashSet<Card>();
        this.possibleCards = new ArrayList<String>();
        this.addCards();
    }

    public boolean addCards() {
        if (this.cards.size() > 0) {
            this.cards = new HashSet<Card>();
        }

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card curr = new Card(rank,suit);
                this.cards.add(curr);
                this.possibleCards.add(curr.getCardName());
            }
        }

        if (this.cards.size() != 52)
            return false;

        return true;
    }

    public Card drawCard() {
        Random rnd = new Random();
        int high = this.possibleCards.size() - 1;

        String drawnCardName = this.possibleCards.get(rnd.nextInt(high));

        if (this.cards.size() == 0) {
            throw new IllegalArgumentException("No more cards in the deck");
        }

        for (Card card : this.cards) {
            if (card.getCardName().equals(drawnCardName)) {
                Card drawnCard = card;
                cards.remove(card);
                return drawnCard;
            }
        }
        return null;
    }

}




package CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String playerName;
    private int cardsCount;
    private List<Card> cards;

    public Player(String playerName) {
        this.playerName = playerName;
        this.cardsCount = 0;
        this.cards = new ArrayList<Card>();
    }

    public void drawCards(Card card) {
        this.cards.add(card);
        this.cardsCount++;
    }

    public String getPlayerName()
    {
        return playerName;
    }
}




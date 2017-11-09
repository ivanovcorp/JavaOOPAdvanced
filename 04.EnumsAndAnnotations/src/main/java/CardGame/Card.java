package CardGame;

public class Card {

    private String cardName;
    private Rank rank;
    private Suit suit;
    private int score;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.cardName = String.format("%s of %s", this.rank.name(), this.suit.name());
        this.score = rank.getRankPower() + suit.getSuitPower();
    }

    public int getScore()
    {
        return this.score;
    }

    public String getCardName()
    {
        return this.cardName;
    }

    @Override
    public String toString()
    {
        return this.cardName;
    }
}




package Exercise;

public class p03_Card {
    private p03_RankPower rankPower;
    private p03_SuitPower suitPower;

    private int score;

    public p03_Card(String rank, String suit) {
        this.rankPower = p03_RankPower.valueOf(rank);
        this.suitPower = p03_SuitPower.valueOf(suit);
        this.score = this.rankPower.getPower() + this.suitPower.getSuitPower();
    }


    @Override
    public String toString()
    {
        return String.format("Card name: %s of %s; Card power: %d", this.rankPower.name(), this.suitPower.name(), this.score);
    }

}




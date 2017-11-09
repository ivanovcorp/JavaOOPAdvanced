package Exercise;

@p04_EnumAnnotation(category = "Suit", description = "Provides suit constants for a Card class.")
public enum p03_SuitPower {

    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int suitPower;

    p03_SuitPower(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return this.suitPower;
    }
}




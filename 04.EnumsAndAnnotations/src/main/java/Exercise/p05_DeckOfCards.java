package Exercise;

public class p05_DeckOfCards {

    public static void main(String[] args) {

        for (p03_SuitPower suit : p03_SuitPower.values()) {
            for (p03_RankPower rank : p03_RankPower.values()) {
                System.out.println(String.format("%s of %s", rank, suit));
            }
        }

    }

}




package CardGame;

public class MainGame {

    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println(deck.drawCard().getCardName());
        System.out.println(deck.drawCard().getCardName());
        System.out.println(deck);
        System.out.println(deck.drawCard().getCardName());
        System.out.println(deck.drawCard().getCardName());



    }
}




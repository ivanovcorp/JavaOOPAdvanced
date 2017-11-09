package CardGame;

import java.util.Map;
import java.util.Random;

public class CardGameRunner {

    private Player player1;
    private Player player2;
    private Deck deck;

    private int games;
    private Map<String, int[]> scores;

    public CardGameRunner(String playerOneName, String playerTwoName) {
        this.initGame(playerOneName, playerTwoName);
        this.playGame();
    }

    public void initGame(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
        this.deck = new Deck();
    }

    public void playGame() {
        while (this.games < 5) {
            boolean isGameFinished = false;
            Random rnd = new Random();
            int turn = rnd.nextInt(1);
            do {
                System.out.print("Draw which player got first turn: " + turn);
                if (turn == 0) {
                    System.out.println("Player 1 is drawing first");
                    drawCardsForPlayer(player1);
                    System.out.println("Player 2 is drawing");
                    drawCardsForPlayer(player2);
                } else {
                    System.out.println("Player 2 is drawing first");
                    drawCardsForPlayer(player2);
                    System.out.println("Player 1 is drawing");
                    drawCardsForPlayer(player1);
                }
            } while (!isGameFinished);
        }
    }

    public void drawCardsForPlayer(Player player) {
        for (int i = 0; i < 5; i++ ) {
            player.drawCards(this.deck.drawCard());
        }
    }
}
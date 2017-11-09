package Exercise;

import java.util.Scanner;

public class p03_PlayCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String rank = "ACE";//sc.nextLine();
        String suit = "SPADES";//sc.nextLine();

        p03_Card card = new p03_Card(rank, suit);
        System.out.println(card.toString());
    }

}




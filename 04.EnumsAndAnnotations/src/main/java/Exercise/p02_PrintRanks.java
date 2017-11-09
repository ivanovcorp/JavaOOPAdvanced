package Exercise;

public class p02_PrintRanks {

    public static void main(String[] args) {

        for (p02_CardRank cardSuite : p02_CardRank.values() ) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s" , cardSuite.ordinal(), cardSuite.name()));
        }

    }

}




package Exercise;

public class p01_PrintSuites {

    public static void main(String[] args) {

        for (p01_CardSuites cardSuite : p01_CardSuites.values() ) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s" , cardSuite.ordinal(), cardSuite.name()));
        }

    }

}




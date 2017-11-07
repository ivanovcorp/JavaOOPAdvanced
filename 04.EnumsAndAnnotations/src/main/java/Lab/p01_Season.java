package Lab;

public enum p01_Season {

    SPRING, SUMMER, AUTUMN, WINTER;

    public static void main(String[] args) {
        p01_Season season = p01_Season.AUTUMN;

        p01_Season test = p01_Season.valueOf(p01_Season.class, "SUMMER");
        System.out.println(test.name());
        switch (season)
        {
            case SPRING:
                System.out.println("Season is Spring.");
                break;
            case SUMMER:
                System.out.println("Season is Summer.");
                break;
            case AUTUMN:
                System.out.println("Season is Autumn.");
                break;
            case WINTER:
                System.out.println("Season is Winter.");
                break;

            default:
                break;
        }
    }
}




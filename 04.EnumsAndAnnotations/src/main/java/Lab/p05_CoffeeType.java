package Lab;


public enum p05_CoffeeType {
    ESPRESSO, LATTE, IRISH;

    @Override
    public String toString()
    {
        String results = super.name().substring(1).toLowerCase();
        return super.name().charAt(0) + results;
    }
}




package Lab;


public enum p05_CoffeeSize {
    SMALL(50, 50), NORMAL(100, 75), DOUBLE(200, 100);

    private double volume;
    private double value;

    p05_CoffeeSize(double mililiters, double cents) {
        this.volume = mililiters;
        this.value = cents;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public String toString()
    {
        String result = super.name().substring(1).toLowerCase();
        return super.name().charAt(0) + result;
    }
}




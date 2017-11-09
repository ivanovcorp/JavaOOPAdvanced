package Lab;

public enum p05_Coin
{
    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50);


    private double value;

    p05_Coin(double value) {
        this.value = value;
    }

    public double getCoinValue() {
        return this.value;    }
}




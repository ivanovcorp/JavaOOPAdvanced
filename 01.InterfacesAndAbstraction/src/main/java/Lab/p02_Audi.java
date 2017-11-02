package Lab;

public class p02_Audi implements p02_Rentable {

    private String model;
    private String color;
    private Integer horsePower;
    private Integer minRentDay;
    private Double pricePerDay;

    public p02_Audi(String model, String color, Integer horsePower, Integer minRentDay, Double pricePerDay) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s and you can rent it for minimum of: %s for the price of %s BGN per day", this.getModel(), this.getMinRentDay(), this.getPricePerDay());
    }

}
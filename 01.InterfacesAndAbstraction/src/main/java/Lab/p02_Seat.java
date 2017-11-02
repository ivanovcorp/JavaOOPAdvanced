package Lab;

import java.io.Serializable;

public class p02_Seat implements p02_Sellable, Serializable {

    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;
    private Double price;

    public p02_Seat(String model, String color, int horsePower, String countryProduced, Double price) {
        this.setModel(model);
        this.setColor(color);
        this.setHorsePower(horsePower);
        this.setCountryProduced(countryProduced);
        this.price = price;
    }

    private void setCountryProduced(String countryProduced) {
        this.countryProduced = countryProduced;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    private void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires. It costs: %s BGN", this.getModel(), this.getCountryProduced(), p02_Car.TIRES, this.price); // tires can be accessed as this.TIRES
    }

    @Override
    public Double getPrice()
    {
        return this.price;
    }

}




package interfaces.carShop;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is ").append(model).append(" produced in ").append(countryProduced).append(" and have ").append(TIRES).append(" tires").append(System.lineSeparator())
                .append(model + " sells for " + price);
        return sb.toString();


    }

    @Override
    public Double getPrice() {
        return price;
    }
}

package interfaces.carShop;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //This is A4 produced in Germany and have 4 tires
        //Minimum rental period of 3 days. Price per day 99,900000
        sb.append("This is ").append(model).append(" produced in ").append(countryProduced).append(" and have ").append(TIRES).
                append(" tires").append(System.lineSeparator())
                .append("Minimum rental period of ").append(minRentDay).append(" days. Price per day ").append(pricePerDay);
        return sb.toString();
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }
}

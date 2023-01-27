package abstraction.hotelReservation;

public class PriceCalculator {
    private final double pricePerDay;
    private final int numberOfDays;
    private final Seasons season;
    private final Discount discount;

    public PriceCalculator(double pricePerDay, int numberOfDays, Seasons season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discount = discount;
    }

    public void calculate() {
        double totalPrice = pricePerDay * numberOfDays * season.getMultiplier();
        totalPrice -= totalPrice * discount.getDiscount();
        System.out.printf("%.2f",totalPrice);
    }
}

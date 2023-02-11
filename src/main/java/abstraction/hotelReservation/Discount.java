package abstraction.hotelReservation;

public enum Discount {
    VIP(0.2),
    SECONDVISIT(0.1),
    NONE(0.0);

    private final double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}

package abstraction.hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] reservation = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(reservation[0]);
        int numOfDays = Integer.parseInt(reservation[1]);
        Seasons season = Seasons.valueOf(reservation[2].toUpperCase());
        Discount discount = Discount.valueOf(reservation[3].toUpperCase());

        PriceCalculator calculator = new PriceCalculator(pricePerDay, numOfDays, season, discount);

        calculator.calculate();
    }
}

package exception.daysOfWeek;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOfWeek;

        while (true) {

            try {
                dayOfWeek = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You should enter a number");
                continue;
            }

            try {
                print(dayOfWeek);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    private static void print(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            default -> throw new IllegalArgumentException("The number should be in the range of [1...7]");
        }
    }
}

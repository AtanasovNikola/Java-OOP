package abstractions.rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = coordinates(scanner);

        Point bottomLeft = new Point(coordinates[0], coordinates[1]);
        Point topRight = new Point(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int numOfCoordinates = Integer.parseInt(scanner.nextLine());

        while (numOfCoordinates-- > 0) {
            int[] coordinatesToCheck = coordinates(scanner);
            Point point = new Point(coordinatesToCheck[0], coordinatesToCheck[1]);

            System.out.println(rectangle.isInside(point));
        }
    }

    public static int[] coordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

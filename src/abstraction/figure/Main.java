package abstraction.figure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Figure figure = new Figure(n);
        System.out.println(figure.getFigure());
    }
}

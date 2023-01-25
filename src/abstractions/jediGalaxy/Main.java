package abstractions.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = readArray(scanner);
        int[][] fieldSize = new int[matrixSize[0]][matrixSize[1]];

        Field field = new Field(fieldSize);

        int[] jediMatrix = readArray(scanner);
        int[] evilMatrix = readArray(scanner);

        Jedi jedi = new Jedi(jediMatrix[0], jediMatrix[1]);
        Evil evil = new Evil(evilMatrix[0], evilMatrix[1]);

        String command = scanner.nextLine();
        if (command.equals("Let the Force be with you")) {
            field.printStars(evil, jedi);
        }

    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

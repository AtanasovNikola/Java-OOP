package interfaces.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> list = new ArrayList<>();
        String line = scanner.nextLine();


        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            switch (tokens.length) {
                case 2 -> {
                    String model = tokens[0];
                    String id = tokens[1];
                    Robot robot = new Robot(id, model);
                    list.add(robot);
                }
                case 3 -> {
                    String name = tokens[0];
                    int age = Integer.parseInt(tokens[1]);
                    String id = tokens[2];
                    Citizen citizen = new Citizen(name, age, id);
                    list.add(citizen);
                }
            }

            line = scanner.nextLine();
        }
            String fakeId= scanner.nextLine();

            for (Identifiable identifiable : list) {
                if (identifiable.getId().endsWith(fakeId)){
                    System.out.println(identifiable.getId());
                }
            }
    }
}

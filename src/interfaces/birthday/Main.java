package interfaces.birthday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Birthable> list = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            switch (tokens[0]) {
                case "Pet" -> {
                    String name = tokens[1];
                    String birthday = tokens[2];
                    Pet pet = new Pet(name,birthday);
                    list.add(pet);
                }
                case "Robot" -> {
                    String model = tokens[1];
                    String id = tokens[2];
                    Robot robot = new Robot(id,model);
                }
                case "Citizen" -> {
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthday = tokens[4];
                    Citizen citizen = new Citizen(name,age,id,birthday);
                    list.add(citizen);
                }
            }

            input = scanner.nextLine();
        }

        String endNumber = scanner.nextLine();
        List<Birthable> collect = list.stream().filter(e -> e.getBirthDate().endsWith(endNumber)).collect(Collectors.toList());
        if (collect.isEmpty()){
            System.out.println("<no output>");
        }else{
          collect.forEach(e-> System.out.println(e.getBirthDate()));
        }

    }
}

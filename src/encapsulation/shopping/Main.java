package encapsulation.shopping;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> peopleMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new HashMap<>();

        String[] people = scanner.nextLine().split(";");
        String[] products = scanner.nextLine().split(";");
        try {

        for (String person : people) {

            String[] param = person.split("=");
            String name = param[0];
            double money = Double.parseDouble(param[1]);
            Person pers = new Person(name, money);
            peopleMap.putIfAbsent(name, pers);

        }
        for (String product : products) {

            String[] param = product.split("=");
            String name = param[0];
            double cost = Double.parseDouble(param[1]);
            Product prod = new Product(name, cost);
            productMap.putIfAbsent(name, prod);
        }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }


        String command = scanner.nextLine();

        while (!command.equals("END")) {

            String[] commands = command.split("\\s+");
            String personName = commands[0];
            String productName = commands[1];
            Person person = peopleMap.get(personName);
            Product product = productMap.get(productName);
            person.buyProduct(product);

            command = scanner.nextLine();
        }
        for (var entry : peopleMap.entrySet()) {
            System.out.println(entry.getValue());
        }


    }
}

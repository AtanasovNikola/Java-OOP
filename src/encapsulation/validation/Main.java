package encapsulation.validation;

import encapsulation.sort.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            try {
                people.add(new Person(firstName, lastName, age, salary));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        double bonus = Double.parseDouble(reader.readLine());

        DecimalFormat decimalFormat = new DecimalFormat("#.0###");
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.printf("%s %s gets %s leva%n",
                    person.getFirstName(), person.getLastName(), decimalFormat.format(person.getSalary()));
        }
    }

}

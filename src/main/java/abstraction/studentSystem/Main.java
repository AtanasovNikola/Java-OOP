package abstraction.studentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("Exit")) {
            String[] currentCommand = command.split("\\s+");
            String name = currentCommand[1];
            switch (currentCommand[0]) {
                case "Create":
                    int age = Integer.parseInt(currentCommand[2]);
                    double grade = Double.parseDouble(currentCommand[3]);
                    Student student = new Student(name, age, grade);
                    students.add(student);
                    break;
                case "Show":
                    Student.print(students, name);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}

package abstraction.studentSystem;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    private String comment() {
        if (grade <= 6 && grade > 5) {
            return "Excellent student";
        } else if (grade <= 5 && grade > 4) {
            return "Average student";
        } else {
            return "Very nice person";
        }
    }


    public static void print(List<Student> students, String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                System.out.print(student);
            }
        }

    }

    @Override
    public String toString() {
        return String.format("%s is %d years old. %s.%n", name, age, comment());
    }
}

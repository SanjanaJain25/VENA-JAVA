package FunctionalProgramming.DataProcessiongAndTransforation;
import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

public class Question32 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ravi", 75),
                new Student("Anita", 85),
                new Student("Kiran", 90),
                new Student("Suresh", 60),
                new Student("Bhavna", 95)
        );

        List<String> topStudents = students.stream()
                .filter(s -> s.getGrade() > 80)
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Top scoring students: " + topStudents);
    }
}


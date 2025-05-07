package FunctionalProgramming.DataProcessiongAndTransforation;

import java.util.*;
import java.util.stream.*;

class Employe {
    String name;
    String department;
    double salary;

    Employe(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}


public class Question35 {
    public static void main(String[] args) {
        List<Employe> employees = Arrays.asList(
                new Employe("Alice", "HR", 50000),
                new Employe("Bob", "IT", 70000),
                new Employe("Charlie", "HR", 60000),
                new Employe("David", "Finance", 75000),
                new Employe("Eve", "IT", 80000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employe::getDepartment,
                        Collectors.averagingDouble(Employe::getSalary)
                ));

        System.out.println("Average salary per department: " + avgSalaryByDept);
    }
}


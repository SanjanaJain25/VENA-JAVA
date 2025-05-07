package FunctionalProgramming.DataProcessiongAndTransforation;

import java.util.*;
import java.util.stream.*;

public class Question34 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "Finance"),
                new Employee("Eve", "IT"),
                new Employee("Frank", "IT")
        );

        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        System.out.println("Employees per department: " + deptCount);
    }

    static class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public String getName() {
            return name;
        }
    }
}

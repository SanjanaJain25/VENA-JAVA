package FunctionalProgramming.CollectorsSummarization;

import java.util.*;
import java.util.stream.*;

class Employees {
    private String name;
    private int joiningYear;
    private double salary;

    public Employees(String name, int joiningYear, double salary) {
        this.name = name;
        this.joiningYear = joiningYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}



public class Question46 {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("vaishali", 2020, 70000),
                new Employees("saurabh", 2021, 85000),
                new Employees("palash", 2020, 95000),
                new Employees("abhishek", 2022, 65000),
                new Employees("aditya", 2021, 78000)
        );


        Map<Integer, Optional<Employees>> maxSalaryByYear = employees.stream()
                .collect(Collectors.groupingBy(
                        Employees::getJoiningYear,
                        Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))
                ));

        // Print results
        maxSalaryByYear.forEach((year, empOpt) ->
                System.out.println("Year: " + year + " -> Max Salary: " + empOpt.orElse(null))
        );
    }
}

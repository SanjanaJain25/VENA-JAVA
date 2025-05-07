package FunctionalProgramming.CustomTypedAndNestedStreams;

import java.util.*;
import java.util.stream.*;


class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


public class Question39 {

    public static Map<String, List<Person1>> groupByAgeRange(List<Person1> people) {
        return people.stream()
                .collect(Collectors.groupingBy(person -> {
                    if (person.getAge() < 20) return "<20";
                    else if (person.getAge() <= 40) return "20-40";
                    else return "40+";
                }));
    }

    public static void main(String[] args) {
        List<Person1> people = Arrays.asList(
                new Person1("Sanjana", 18),
                new Person1("Pragya", 25),
                new Person1("Shanu", 35),
                new Person1("Vishal", 42),
                new Person1("Siya", 15),
                new Person1("Rajesh", 55)
        );

        Map<String, List<Person1>> grouped = groupByAgeRange(people);

        grouped.forEach((ageGroup, persons) -> {
            System.out.println(ageGroup + " → " + persons);
        });
    }
}

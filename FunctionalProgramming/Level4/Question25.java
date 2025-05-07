package FunctionalProgramming.Level4;

import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Question25 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sanjana", 17),
                new Person("Ranu", 22),
                new Person("Kratika", 19),
                new Person("Pragya", 16),
                new Person("Siya", 25)
        );


        List<String> adultNames = people.stream()
                .filter(person -> person.age > 18)
                .map(person -> person.name)
                .collect(Collectors.toList());

        System.out.println("Adult names: " + adultNames);
    }
}

package com.example.javafunctional.stream;

import com.example.javafunctional.JavaFunctionalApplication;


import static com.example.javafunctional.stream._Streams.Gender.*;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Streams {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("John", MALE),
                new Person("Marry", FEMALE),
                new Person("David", MALE),
                new Person("Jack", MALE),
                new Person("Alex", MALE)
        );


//        personList.stream().map(person -> person.gender)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//
        personList.stream().map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        Predicate<Person> containsFemaleOnly=person -> FEMALE.equals(person.gender);


        System.out.println("personList.stream().allMatch(containsFemaleOnly) = "
                 + personList.stream().allMatch(containsFemaleOnly));


        int integer= personList.stream().map(person -> person.name)
                .mapToInt(String::length)
                .max()
                .getAsInt();
        System.out.println("integer = " + integer);

    }


    static class Person {
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


    enum Gender {
        MALE, FEMALE
    }


}


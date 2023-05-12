package com.example.javafunctional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SpringBootApplication
public class JavaFunctionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaFunctionalApplication.class, args);

		List<Person> personList=List.of(
				new Person("John",Gender.MALE),
				new Person("Marry",Gender.FEMALE),
				new Person("David",Gender.MALE),
				new Person("Jack",Gender.MALE),
				new Person("Alex",Gender.MALE)
		);

		List<Person>  female=new ArrayList<>();
		Predicate<Person> personPredicate= person -> Gender.FEMALE.equals(person.gender);

			personList.stream().filter(personPredicate)
					.collect(Collectors.toList())
					.forEach(System.out::println);


	}

	static class Person{
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


	enum Gender
	{
		MALE,FEMALE
	}
}

package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Cat cat = Cat.builder()
				.name("CAT")
                .claws(true)
                .build();

	    Tiger tiger = Tiger.builder()
				.name("TIGER")
				.claws(true)
                .strips(true)
                .build();

	    Dog dog = Dog.builder()
				.name("DOG")
                .teeth(true)
                .build();

	    for (Animal animal: Arrays.asList(cat, tiger, dog)) {
	    	System.out.print(animal.name + ": ");
	        animal.say();
        }
    }
}

package com.jacobfrancois.animalSounds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class AnimalSoundsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AnimalSoundsApplication.class, args);
	}

	@Override
	public void run(String... args){
		Cat cat = new Cat();
		cat.makeSound();
	}

}

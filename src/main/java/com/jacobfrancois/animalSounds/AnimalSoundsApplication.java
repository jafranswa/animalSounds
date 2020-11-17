package com.jacobfrancois.animalSounds;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class AnimalSoundsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AnimalSoundsApplication.class, args);
	}

	@Override
	public void run(String... args){
		//Cat cat = new Cat();
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Cat cat = (Cat) factory.getBean("cat");
		Dog dog = (Dog) factory.getBean("dog");
		cat.makeSound();
		dog.makeSound();
	}

}

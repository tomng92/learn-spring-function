package com.example.learnspringfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class LearnSpringFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> function() {
		return input -> "You send: <"+ input + ">";
	}

	@Bean
	public Consumer<String> consume() {
		return input -> System.out.println("Input is " + input);
	}

	@Bean
	public Supplier<String> supply() {
		return () -> "Hello Youtube!";
	}
}

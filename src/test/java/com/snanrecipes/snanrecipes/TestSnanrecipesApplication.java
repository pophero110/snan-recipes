package com.snanrecipes.snanrecipes;

import org.springframework.boot.SpringApplication;

public class TestSnanrecipesApplication {

	public static void main(String[] args) {
		SpringApplication.from(SnanrecipesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

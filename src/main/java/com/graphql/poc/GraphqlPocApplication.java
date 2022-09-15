package com.graphql.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlPocApplication.class, args);
	}

	public static void main(char[] args) {
		System.out.println("char");
	}
}

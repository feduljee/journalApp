package com.example.journalApp;
// How to integrate MongoDB in your Spring Boot application - Engineering Digest.
// https://www.youtube.com/watch?v=jvSicVdHKT8&list=PLA3GkZPtsafacdBLdd3p1DyRd5FGfr3Ue&index=13

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JournalApplication.class, args);
	}

}

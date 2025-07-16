package com.example.journalApp;
// How to integrate MongoDB in your Spring Boot application - Engineering Digest.
// https://www.youtube.com/watch?v=jvSicVdHKT8&list=PLA3GkZPtsafacdBLdd3p1DyRd5FGfr3Ue&index=13
// This code is part of a Spring Boot application that uses MongoDB for data persistence.
//
// This is the @Transaction configuration for the application.
// https://www.youtube.com/watch?v=6oxyNgZSz9s&list=PLA3GkZPtsafacdBLdd3p1DyRd5FGfr3Ue&index=17

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JournalApplication.class, args);
	}

	@Bean
	public PlatformTransactionManager add(MongoDatabaseFactory dbFactory) {
		return new MongoTransactionManager(dbFactory);
	}
}

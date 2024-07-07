package com.api.book.bookrestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.api.book.bookrestbook.DAO")
@EntityScan(basePackages = "com.api.book.bookrestbook.entity")
public class BookrestbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookrestbookApplication.class, args);
	}

}

package com.itacademy.botigaCuadres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BotigaCuadresApplication {

	public static void main(String[] args) {
		SpringApplication.run(BotigaCuadresApplication.class, args);
	}

}

package com.vaccination.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.vaccination.demo.controller","com.vaccination.demo.service","com.vaccination.demo.dao"})
@EnableJpaRepositories("com.vaccination.demo.dao")
@EntityScan("com.vaccination.demo.entity")
public class Covid19VaccinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19VaccinationApplication.class, args);
		SpringApplication.run(Covid19VaccinationApplication.class,args);
	}

}

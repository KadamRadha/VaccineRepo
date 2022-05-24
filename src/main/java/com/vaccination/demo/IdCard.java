package com.vaccination.demo;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Data
@EntityScan
@Table(name = "IdCard")
public class IdCard {
	private int id;
	private String name;
	private LocalDate dob;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String pincode;
}




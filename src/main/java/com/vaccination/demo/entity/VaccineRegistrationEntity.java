package com.vaccination.demo.entity;

import java.time.LocalDate;

@Entity
@Table(name = "Registration")
@Data
@ToString

public class VaccineRegistrationEntity {
	
	@Id
	@GenerateValue(Strategy = GenerationType.IDENTITY)
	@Column(name="mobileno")
	private int mobileno;
	
	@column(name="dateofregistration")
	private LocalDate dateofregistration;

	public void setVaccineId(Object vaccineId) {
		// TODO Auto-generated method stub
		
	}

	public void setVaccineName(Object vaccineName) {
		// TODO Auto-generated method stub
		
	}

}

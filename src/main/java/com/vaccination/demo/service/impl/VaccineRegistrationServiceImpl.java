package com.vaccination.demo.service.impl;

import org.springframework.stereotype.Service;

import com.vaccination.demo.AppError;
import com.vaccination.demo.Vaccine;
import com.vaccination.demo.controller.Response;
import com.vaccination.demo.controller.VaccineRegistration;
import com.vaccination.demo.dao.VaccinationDAO;
import com.vaccination.demo.entity.VaccineRegistrationEntity;

import java.util.Optional;

@Service
public class VaccineRegistrationServiceImpl  implements VaccineRegistration{
	private VaccinationDAO vaccinationDAO;
	
	@Override
	public Response<Vaccine>addVaccineRegistration(Vaccine vaccine){
		Response<Vaccine> response = new Response<>();
		try
		{
			VaccineRegistrationEntity entity = VaccinationDAO.findById(Vaccine.getVaccineId()).get());
	    if(entity != null)
	    {
	    	AppError error = new AppError();
	    	error.setVaccine1Id("");
	    }
		
	}
	
		
	
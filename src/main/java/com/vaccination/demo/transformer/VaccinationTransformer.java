package com.vaccination.demo.transformer;

import com.vaccination.demo.Vaccine;
import com.vaccination.demo.VaccineRegistration;
import com.vaccination.demo.entity.VaccineRegistrationEntity;

public class VaccinationTransformer {
	public static VaccineRegistrationEntity VaccinationRegistrationEntity(VaccineRegistration vaccination) {
		if(vaccination !=null) {
			VaccineRegistrationEntity entity = new VaccineRegistrationEntity();
			entity.setVaccineId(Vaccine.getVaccineId());
			entity.setVaccineName(Vaccine.getVaccineName());
			
			return entity;
		}
		return null;
		}
	}


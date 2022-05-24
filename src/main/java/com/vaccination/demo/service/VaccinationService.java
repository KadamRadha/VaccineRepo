package com.vaccination.demo.service;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.vaccination.demo.controller.Response;
import com.vaccination.demo.controller.VaccineRegistration;
import com.vaccination.demo.repository.UserRepository;

@Service
public class VaccinationService {
	
	@Autowired
	private UserRepository userRepository;
	public Response<User> login (Login login){
		Response<user> response = new Response<>();
		User user  = userRepository.login(login);
		
		if(user != null)
		{
			response.setData(user);
		}else {
			response.setStatus(Response.ERROR);
			response.setErrorMessage("Invalid Details");
		}
		return response;
	}
	public Response<User> addUser(User reqUser){
		Response<User> response = new Response<>();
		user user = UserRespository.addUser(regUser);
		if(user !)
	}
	public static Response<VaccineRegistration> updateVaccineRegistration(VaccineRegistration vaccineRegistration) {
		// TODO Auto-generated method stub
		return null;
	}

}

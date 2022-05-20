package com.vaccination.demo.service;
import java.util.Collections;
import org.springframework.stereotype.Service;

@Service
public class VaccinationService {
	
	@Autowired
	private UserRepository userRepository;
	public Response<User> login (Login login){
		Response<User> response = new Response<>();
		User user =userRepository.login(login);
		
		if(User != null)
		{
			respose.setData(user);
		}else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("Invalid Details");
		}
		return response;
	}
	public Response<user> addUser(user reqUser){
		Response<user> response = new Response<>();
		User user = userRespository.addUser(regUser);
		if(user !)
	}

}

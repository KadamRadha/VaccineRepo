package com.vaccination.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class VaccinationController {
	
	@RequestMapping(value = "/Message")
	
	public String getMessage() {
		return "msg";
    }
}

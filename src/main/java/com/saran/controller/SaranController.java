package com.saran.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaranController {
	
	@GetMapping("/")  //restful endpoints
	public String display() {
		return "Welcome to the world of Spring Boot";
	}

}

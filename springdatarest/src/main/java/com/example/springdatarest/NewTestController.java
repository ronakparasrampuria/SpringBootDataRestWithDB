package com.example.springdatarest;


import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class NewTestController {

	@GetMapping("/greeting")
	public  Alien getRequest() {
		Alien a= new Alien();
		//RestTemplate restTemplate = new RestTemplate();
		a.setAid(3);
		a.setAname("Test");
		a.setAname("New");
		return a;
	}
	
	@RequestMapping("/insertData")
	public void insertData(@RequestBody TestPojo alien) {
		//final Alien person =
			    //  new ObjectMapper().readValue(personDTO, Alien.class);
		//System.out.println(person);
		System.out.println(alien.toString());
		
	}
}

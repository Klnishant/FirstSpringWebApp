package com.example.firstSpringWebApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstControllers {
	
	@GetMapping
	public String getHelloWorld() {
		return "Hello World";
		
	}
	
	@GetMapping("searching")
	public String searchkro(@RequestParam(name = "q") String value) {
		return value;
	}
	
	@GetMapping("searching/{name}")
	public String searchPath(@PathVariable(name = "name") String value) {
		return value;
	}
	
	@PostMapping(path = "post")
	public void postkro() {
		System.out.println("Running Post");
	}
}

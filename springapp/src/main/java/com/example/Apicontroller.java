public package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
public class Apicontroller {
	@GetMapping("Welcome")
	public String display() {
		return "welcome";	
		}
}
 

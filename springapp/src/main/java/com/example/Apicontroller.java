public package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
public class Sample {
	@GetMapping("Welcome")
	public String Welcome() {
		return "Welcome ";	
		}
}
 Apicontroller {
    
}

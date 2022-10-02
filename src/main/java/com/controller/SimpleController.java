package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(value="/")
	public String greetin() {
		return "Welcome to spring boot with aws";
	}
	
	@GetMapping(value="say/{name}")
	public String Hello(@PathVariable("name") String name) {
		return "Welcome to shitsburh... "+name+"!!!";
		
	}
	

}

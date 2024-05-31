package com.cjc.main.controller;

import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
	
	@GetMapping("/path")
	public String getMethodName() {
		
		System.out.println("Get Mapping mapi..");
		
		return "Get the Data Successfully!..";
	}
	
	

}

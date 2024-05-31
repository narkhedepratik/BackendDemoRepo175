package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@DeleteMapping("/delete")
	public String deleteReqest() {
		System.out.println("deleteRequest");
		return "delete By Yash";
	}

}

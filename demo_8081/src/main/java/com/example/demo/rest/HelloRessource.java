package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRessource {

	public HelloRessource( ) {
		
	}
	
	@RequestMapping( path = "sayHello")
	public String hello() {
		return "hello";
	}
}

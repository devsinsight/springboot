package org.company.java.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

	@CrossOrigin
	@RequestMapping("/greetings")
	public String Index(){

		return "Hello World!";
	}
	
}

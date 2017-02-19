package org.company.java.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.company.java.demo.model.DragonBallCharacter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

	@CrossOrigin
	@RequestMapping("/greetings")
	public string Index(){

		return "Hello World!";
	}
	
}

package org.company.java.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.company.java.demo.model.DragonBallCharacter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/character/")
public class CharacterController {

	
	@CrossOrigin
	@RequestMapping(value = "getCharacters", method = RequestMethod.GET)
	public List<DragonBallCharacter> GetCharacters(){
		
		List<DragonBallCharacter> characters = new ArrayList<DragonBallCharacter>();
		
		characters.add(new org.company.java.demo.model.DragonBallCharacter(1, "Son Goku", ""));
		characters.add(new org.company.java.demo.model.DragonBallCharacter(2, "Son Gohan", ""));
		characters.add(new org.company.java.demo.model.DragonBallCharacter(3, "Kuririn", ""));
		
		return characters;
	}
}

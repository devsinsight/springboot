package org.company.java.demo.controller;

import java.util.List;

import org.company.java.demo.model.DragonBallCharacter;
import org.company.java.demo.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/character/")
public class CharacterController {

	@Autowired
	private CharacterRepository _characterRepository;
	
	@CrossOrigin
	@RequestMapping(value = "getCharacters", method = RequestMethod.GET)
	public List<DragonBallCharacter> GetCharacters(){
		
		return _characterRepository.findAll();
	}
}

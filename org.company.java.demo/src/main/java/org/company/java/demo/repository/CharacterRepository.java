package org.company.java.demo.repository;

import org.company.java.demo.model.DragonBallCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<DragonBallCharacter, Integer>{

}

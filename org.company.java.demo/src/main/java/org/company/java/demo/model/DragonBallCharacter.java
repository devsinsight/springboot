package org.company.java.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Character", schema="dbo")
public class DragonBallCharacter {
	
	@Id
	public int id;
	
	@Column(name = "AnimeName")
	public String animeName;
	
	@Column(name = "AlternateNames")
	public String alternateNames;
	
	@Column(name = "Race")
	public String race;
	
	@Column(name = "Gender")
	public char gender;
	
	@Column(name = "DateOfBirth")
	public String dateOfBirth;
	
	@Column(name = "DateOfDeath")
	public String dateOfDeath;
	
	public DragonBallCharacter(){}
	
}

package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.entity.Personne;
import com.intiFormation.service.IPersonneService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class PersonneController {
	
	@Autowired
	private IPersonneService personneService;
	
	@GetMapping("/personnes")
	public List<Personne> chercherAll()
	{
		List<Personne> personnes=personneService.chercherAll();
		return personnes;
	}
	
	@PostMapping("/personnes")
	public void inserer(@RequestBody Personne personne)
	{
		personneService.inserer(personne);
	}
	
	
	@DeleteMapping("/personnes/{id}")
	public void enlever(@PathVariable("id") int id)
	{
		personneService.enlever(id);
	}
	
	
	@GetMapping("/personnes/{id}")
	public Personne parId(@PathVariable("id") int id)
	{
		Personne personne=personneService.parId(id).get();
		return personne;
	}
	
	
	
	

}

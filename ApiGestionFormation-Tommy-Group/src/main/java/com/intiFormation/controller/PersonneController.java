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
import com.intiFormation.service.IpersonneService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class PersonneController {
	
	@Autowired
	private IpersonneService personneService;
	
	@GetMapping("/personnes")
	public List<Personne> getAllPersonne()
	{
		List<Personne> personnes=personneService.chercher_all();
		return personnes;
	}
	
	@PostMapping("/personnes")
	public void ajouterPersonne(@RequestBody Personne p)
	{
		personneService.inserer(p);
	}
	
	
	@DeleteMapping("/personnes/{id}")
	public void supprimerPersonne(@PathVariable("id") int id)
	{
		personneService.enlever(id);
	}
	
	@PutMapping("/personnes")
	public void modifierPersonne(@RequestBody Personne p)
	{
		personneService.inserer(p);
		
	}
	
	@GetMapping("/personnes/{id}")
	public Personne selectByidPersonne(@PathVariable("id") int id)
	{
		Personne personne=personneService.chercher_un(id).get();
		return personne;
	}
	
	
	
	

}

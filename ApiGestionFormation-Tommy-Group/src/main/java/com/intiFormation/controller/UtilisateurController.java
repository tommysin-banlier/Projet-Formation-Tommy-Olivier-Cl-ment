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

import com.intiFormation.entity.Utilisateur;
import com.intiFormation.service.IUtilisateurservice;
@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class UtilisateurController {
	
	
	@Autowired
	private IUtilisateurservice utilisateurService;
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> getAll()
	{
		List<Utilisateur> personnes=utilisateurService.chercher_all_Utilisateur();
		return personnes;
	}
	
	@PostMapping("/utilisateurs")
	public void ajouter(@RequestBody Utilisateur p)
	{
		utilisateurService.insererUser(p);
	}
	
	
	@DeleteMapping("/utilisateurs/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		utilisateurService.enleverUtilisateur(id);
	}
	
	@PutMapping("/utilisateurs")
	public void modifier(@RequestBody Utilisateur p)
	{
		utilisateurService.insererUser(p);
		
	}
	
	@GetMapping("/utilisateurs/{id}")
	public Utilisateur selectByid(@PathVariable("id") int id)
	{
		Utilisateur personne=utilisateurService.chercher_IdUnUtilisateur(id).get();
		return personne;
	}
	

}

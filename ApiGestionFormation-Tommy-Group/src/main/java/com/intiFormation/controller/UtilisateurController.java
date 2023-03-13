package com.intiFormation.controller;

import java.util.List;

import org.apache.tomcat.util.http.parser.Upgrade;
import org.hibernate.hql.internal.ast.tree.IntoClause;
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

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.intiFormation.entity.Utilisateur;
import com.intiFormation.service.IUtilisateurservice;
@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class UtilisateurController {
	
	
	@Autowired
	private IUtilisateurservice utilisateurService;
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> chercherAll()
	{
		List<Utilisateur> personnes=utilisateurService.chercherAll();
		return personnes;
	}
	
	@PostMapping("/utilisateurs")
	public void inserer(@RequestBody Utilisateur p)
	{
		utilisateurService.inserer(p);
	}
	
	
	@DeleteMapping("/utilisateurs/{id}")
	public void enlever(@PathVariable("id") int id)
	{
		utilisateurService.enlever(id);
	}
	
	
	@GetMapping("/utilisateurs/{id}")
	public Utilisateur parId(@PathVariable("id") int id)
	{
		Utilisateur personne=utilisateurService.parId(id).get();
		return personne;
	}
	
	@PostMapping("/upgradeParticipant/{id}")
	public void upgradeParticipant(@PathVariable("id") int idp)
	{
		utilisateurService.upgradeParticipant(idp);
	}
	
	@PostMapping("/upgradeFormateur/{id}")
	public void upgradeFormateur(@PathVariable("id") int id)
	{
		utilisateurService.upgradeFormateur(id);
	}
	
	@PostMapping("/upgradeCommercial/{id}")
	public void upgradeCommercial(@PathVariable("id") int id)
	{
		utilisateurService.upgradeCommercial(id);
	}

	
	
	
	
	

	
}

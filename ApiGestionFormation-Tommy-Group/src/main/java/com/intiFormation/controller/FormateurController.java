package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.entity.Formateur;
import com.intiFormation.entity.Formation;
import com.intiFormation.entity.Paiement;
import com.intiFormation.entity.Personne;
import com.intiFormation.service.IFormateurService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class FormateurController {

	@Autowired
	IFormateurService formateurService;
	
	
	@GetMapping("/formateurs")
	public List<Formateur> chercherAll() {
		return formateurService.chercherAll();
	}
	
	@PostMapping("/formateurs")
	public void inserer(@RequestBody Formateur formateur) {
		formateurService.inserer(formateur);
	}
	
	@DeleteMapping("/formateurs/{id}")
	public void enlever(@PathVariable("id") int id) {
		formateurService.enlever(id);
	}
	
	@GetMapping("/formateurs/{id}")
	public Formateur parId(@PathVariable("id") int id) {
		return formateurService.parId(id).get();
	}
	
/*	
	@GetMapping("/formateurs/formation/{id}")
	public List<Formateur> parFormation(@PathVariable("id") int id) {
		return formateurService.parFormation(id);
	}
*/	
	
	
	
	
	
	
	
}

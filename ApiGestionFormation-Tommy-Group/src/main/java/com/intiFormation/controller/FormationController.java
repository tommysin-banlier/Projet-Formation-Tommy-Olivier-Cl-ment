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


import com.intiFormation.entity.Formation;
import com.intiFormation.service.IFormationService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class FormationController {

	
	@Autowired
	IFormationService formationService;
	
	
	@GetMapping("/formations")
	public List<Formation> chercherAll() {
		return formationService.chercherAll();
	}
	
	@PostMapping("/formations")
	public void inserer(@RequestBody Formation formation) {
		formationService.inserer(formation);
	}
	
	@DeleteMapping("/formations/{id}")
	public void enlever(@PathVariable("id") int id) {
		formationService.enlever(id);
	}
	
	@GetMapping("/formations/{id}")
	public Formation parId(@PathVariable("id") int id) {
		return formationService.parId(id).get();
	}
	
	@GetMapping("/formations/formateur/{id}")
	public List<Formation> parFormation(@PathVariable("id") int id) {
		return formationService.parFormateur(id);
	}
	
	@GetMapping("formations/participant/{id}")
	public List<Formation> parParticipant(@PathVariable("id") int id) {
		return formationService.parParticipant(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

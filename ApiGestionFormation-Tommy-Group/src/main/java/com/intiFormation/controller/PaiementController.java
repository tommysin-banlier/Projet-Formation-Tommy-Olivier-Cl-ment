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


import com.intiFormation.entity.Paiement;
import com.intiFormation.service.IPaiementService;



@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class PaiementController {

	
	@Autowired
	IPaiementService paiementService;
	
	
	@GetMapping("/paiements")
	public List<Paiement> chercherAll() {
		return paiementService.chercherAll();
	}
	
	@PostMapping("/paiements")
	public void inserer(@RequestBody Paiement paiement) {
		paiementService.inserer(paiement);
	}
	
	@DeleteMapping("/paiements/{id}")
	public void enlever(@PathVariable("id") int id) {
		paiementService.enlever(id);
	}
	
	@GetMapping("/paiements/{id}")
	public Paiement parId(@PathVariable("id") int id) {
		return paiementService.parId(id).get();
	}
	
	
	
	
	
	
	
	
}

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


import com.intiFormation.entity.Participant;
import com.intiFormation.service.IParticipantService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class ParticipantController {

	@Autowired
	IParticipantService participantService;
	
	
	@GetMapping("/participants")
	public List<Participant> chercherAll() {
		return participantService.chercherAll();
	}
	
	@PostMapping("/participants")
	public void inserer(@RequestBody Participant participant) {
		participantService.inserer(participant);
	}
	
	@DeleteMapping("/participants/{id}")
	public void enlever(@PathVariable("id") int id) {
		participantService.enlever(id);
	}
	
	@GetMapping("/participants/{id}")
	public Participant parId(@PathVariable("id") int id) {
		return participantService.parId(id).get();
	}
	
	@GetMapping("/participants/formation/{id}")
	public List<Participant> parFormation(@PathVariable("id") int id) {
		return participantService.parFormation(id);
	}
	
	
	
	
	
	
	
	
	
}

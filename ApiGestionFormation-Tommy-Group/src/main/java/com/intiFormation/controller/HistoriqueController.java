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

import com.intiFormation.entity.Commercial;
import com.intiFormation.entity.Historique;
import com.intiFormation.service.HistoriqueService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class HistoriqueController {
	
	@Autowired
	private HistoriqueService historiqueService;
	
	    //pour méthode “chercherAll” :
		@GetMapping("/historiques")
		public List<Historique> chercherAll() 
		{
			return historiqueService.chercherAll();
		}


	    //pour méthode “inserer” :
		@PostMapping("/historiques")
		public void inserer(@RequestBody Historique historique)
		{
			historiqueService.inserer(historique);
		}


	    //pour méthode “enlever”
		@DeleteMapping("/historiques/{id}")
		public void enlever(@PathVariable("id") int id)
		{
			historiqueService.enlever(id);
		}
		
		//pour méthode “parId”
		@GetMapping("/historiques/{id}")
		public Historique parId(@PathVariable("id") int id)
		{
			return historiqueService.parId(id).get();
		}


}

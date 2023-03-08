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

import com.intiFormation.entity.Historique;
import com.intiFormation.entity.RDV;
import com.intiFormation.service.IRDVService;
import com.intiFormation.service.RDVService;



@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class RDVController {
	
	@Autowired
	private IRDVService rdvService;
	
	    //pour méthode “chercherAll” :
		@GetMapping("/rdvs")
		public List<RDV> chercherAll() 
		{
			return rdvService.chercherAll();
		}


	    //pour méthode “inserer” :
		@PostMapping("/rdvs")
		public void inserer(@RequestBody RDV rdv)
		{
			rdvService.inserer(rdv);
		}


	    //pour méthode “enlever”
		@DeleteMapping("/rdvs/{id}")
		public void enlever(@PathVariable("id") int id)
		{
			rdvService.enlever(id);
		}
		
		//pour méthode “parId”
		@GetMapping("/rdvs/{id}")
		public RDV parId(@PathVariable("id") int id)
		{
			return rdvService.parId(id).get();
		}

}

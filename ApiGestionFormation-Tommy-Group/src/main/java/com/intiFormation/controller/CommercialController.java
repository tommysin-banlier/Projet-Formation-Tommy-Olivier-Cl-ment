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
import com.intiFormation.service.CommercialService;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class CommercialController {
	
	@Autowired
	private CommercialService commercialService;
	
	    //pour méthode “chercherAll” :
		@GetMapping("/commercials")
		public List<Commercial> chercherAll() 
		{
			return commercialService.chercherAll();
		}


	    //pour méthode “inserer” :
		@PostMapping("/commercials")
		public void inserer(@RequestBody Commercial commercial)
		{
			commercialService.inserer(commercial);
		}


	    //pour méthode “enlever”
		@DeleteMapping("/commercials/{id}")
		public void enlever(@PathVariable("id") int id)
		{
			commercialService.enlever(id);
		}
		
		//pour méthode “parId”
		@GetMapping("/commercials/{id}")
		public Commercial parId(@PathVariable("id") int id)
		{
			return commercialService.parId(id).get();
		}


}

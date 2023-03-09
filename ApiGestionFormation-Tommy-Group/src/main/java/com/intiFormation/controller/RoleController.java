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

import com.intiFormation.entity.Role;
import com.intiFormation.service.IRoleService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class RoleController {
	@Autowired
	private IRoleService roleService;
	
	@GetMapping("/roles")
	public List<Role> chercherAll() {
		return roleService.chercherAll();
	}
	
	@PostMapping("/roles")
	public void inserer(@RequestBody Role role) {
		roleService.inserer(role);
	}
	
	@DeleteMapping("/roles/{id}")
	public void enlever(@PathVariable("id") int id) {
		roleService.enlever(id);
	}
	
	@GetMapping("/roles/{id}")
	public Role parId(@PathVariable("id") int id) {
		return roleService.parId(id).get();
	}
	
	//fin de journee
	

}

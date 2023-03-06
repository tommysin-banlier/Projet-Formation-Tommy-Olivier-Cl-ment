package com.intiFormation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@OneToMany(mappedBy = "role")
	private List<Utilisateur> utilisateurs;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
	public Role(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	public Role(String nom) {
		super();
		this.nom = nom;
	}
	
	
	public Role(int id, String nom, List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.utilisateurs = utilisateurs;
		
	}
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

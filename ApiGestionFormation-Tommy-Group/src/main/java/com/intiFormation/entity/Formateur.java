package com.intiFormation.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Formateur")
public class Formateur extends Utilisateur{

	@OneToMany(mappedBy = "formateur")
	private List<Formation> formations;


	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formateur(int id, String nom, String prenom, int age, String username, String password, Role role) {
		super(id, nom, prenom, age, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Formateur(int id, String nom, String prenom, int age, String username, String password) {
		super(id, nom, prenom, age, username, password);
		// TODO Auto-generated constructor stub
	}

	public Formateur(int id, String nom, String prenom, int age) {
		super(id, nom, prenom, age);
		// TODO Auto-generated constructor stub
	}

	public Formateur(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}


	
	
	

}

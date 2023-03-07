package com.intiFormation.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Commercial")
public class Commercial extends Utilisateur{

	public Commercial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commercial(int id, String nom, String prenom, int age, String username, String password, Role role) {
		super(id, nom, prenom, age, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Commercial(int id, String nom, String prenom, int age, String username, String password) {
		super(id, nom, prenom, age, username, password);
		// TODO Auto-generated constructor stub
	}

	public Commercial(int id, String nom, String prenom, int age) {
		super(id, nom, prenom, age);
		// TODO Auto-generated constructor stub
	}

	public Commercial(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}

	
}

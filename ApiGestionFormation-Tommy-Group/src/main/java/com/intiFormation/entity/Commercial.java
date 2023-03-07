package com.intiFormation.entity;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Commercial")
public class Commercial extends Utilisateur {

	
	@OneToMany(mappedBy = "commercial")
	private List<RDV> rdvs;
	
	
	
	
	
	public List<RDV> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<RDV> rdvs) {
		this.rdvs = rdvs;
	}
	


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


	public Commercial(int id, String nom, String prenom, int age, String username, String password, Role role,
			List<RDV> rdvs) {
		super(id, nom, prenom, age, username, password, role);
		this.rdvs = rdvs;
	}

	
	
	
	
	
	
	
	

	
}

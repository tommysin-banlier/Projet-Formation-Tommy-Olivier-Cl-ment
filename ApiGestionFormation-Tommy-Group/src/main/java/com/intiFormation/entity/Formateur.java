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

	public Formateur(int id, String username, String password, Role role) {
		super(id, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Formateur(String username, String password, Role role) {
		super(username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Formateur(int id, String username, String password, Role role, List<Formation> formations) {
		super(id, username, password, role);
		this.formations = formations;
	}
	
	
	
	
	

}

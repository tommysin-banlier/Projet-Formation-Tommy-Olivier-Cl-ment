package com.intiFormation.entity;

import java.util.List;

import javax.persistence.*;
import javax.persistence.ManyToOne;

@Entity
public class Participant extends Utilisateur{

	@ManyToOne
	@JoinColumn(name = "idFormation")
	private List<Formation> formations;
	
	@OneToOne(mappedBy = "participant")
	private Paiement paiement;

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Participant(int id, String nom, String prenom, int age, String username, String password, Role role) {
		super(id, nom, prenom, age, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Participant(int id, String nom, String prenom, int age, String username, String password) {
		super(id, nom, prenom, age, username, password);
		// TODO Auto-generated constructor stub
	}

	public Participant(int id, String nom, String prenom, int age) {
		super(id, nom, prenom, age);
		// TODO Auto-generated constructor stub
	}

	public Participant(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}

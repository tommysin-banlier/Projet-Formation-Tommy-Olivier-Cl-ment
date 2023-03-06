package com.intiFormation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;

@Entity
public class Participant extends Utilisateur {

	
	
	@ManyToMany
	@JoinTable(
		name = "Participants-Formations",
		joinColumns =  @JoinColumn(name = "Participant") ,
		inverseJoinColumns =  @JoinColumn(name = "Formation") 
	)
	private List<Formation> formations;
	
	
	@OneToOne(mappedBy = "participant")
	private Paiement paiement;


	
	public List<Formation> getFormations() {
		return formations;
	}


	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}


	public Paiement getPaiement() {
		return paiement;
	}


	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}


	public Participant(int id, String nom, String prenom, int age, String username, String password, Role role,
			List<Formation> formations, Paiement paiement) {
		super(id, nom, prenom, age, username, password, role);
		this.formations = formations;
		this.paiement = paiement;
	}


	public Participant(int id, String nom, String prenom, int age, String username, String password, Role role) {
		super(id, nom, prenom, age, username, password, role);
	}


	public Participant() {
		super();
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

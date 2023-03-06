package com.intiFormation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Paiement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float montant;
	
	
	@ManyToOne
	@JoinColumn(name = "idParticipant")
	private Participant participant;
	
	
	@ManyToOne
	@JoinColumn(name = "idFormation")
	private Formation formation;


	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getMontant() {
		return montant;
	}


	public void setMontant(float montant) {
		this.montant = montant;
	}


	public Participant getParticipant() {
		return participant;
	}


	public void setParticipant(Participant participant) {
		this.participant = participant;
	}


	public Formation getFormation() {
		return formation;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	
	public Paiement(int id, float montant, Participant participant, Formation formation) {
		super();
		this.id = id;
		this.montant = montant;
		this.participant = participant;
		this.formation = formation;
	}


	public Paiement(float montant) {
		super();
		this.montant = montant;
	}


	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
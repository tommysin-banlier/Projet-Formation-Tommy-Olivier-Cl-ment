package com.intiFormation.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Historique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="dd/MM/yyyy'T'HH:mm")
	private Date date;

	private String commentaire;

	@ManyToOne
	@JoinColumn(name = "idPersonne")
	private Personne personne;

	@ManyToOne
	@JoinColumn(name = "idCommercial")
	private Commercial commercial;
 
	
	
 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Commercial getCommercial() {
		return commercial;
	}

	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}

	
	public Historique(int id, Date date, String commentaire, Personne personne, Commercial commercial) {
		super();
		this.id = id;
		this.date = date;
		this.commentaire = commentaire;
		this.personne = personne;
		this.commercial = commercial;
	}
	
	
	public Historique(int id, Date date, String commentaire) {
		super();
		this.id = id;
		this.date = date;
		this.commentaire = commentaire;
	}

	
	public Historique(Date date, String commentaire) {
		super();
		this.date = date;
		this.commentaire = commentaire;
	}
 
	
	public Historique() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	

}

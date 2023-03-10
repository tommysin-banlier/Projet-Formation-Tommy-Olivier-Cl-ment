package com.intiFormation.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class RDV {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	//@DateTimeFormat(pattern = "dd/MM/yyyy'T'HH:mm")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm", locale="fr_Fr", timezone= "Europe/Amsterdam")
	private Date date;

	@ManyToOne
	@JoinColumn(name = "idCommercial")
	private Commercial commercial;

	@ManyToOne
	@JoinColumn(name = "idPersonne")
	private Personne personne;

	
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

	public Commercial getCommercial() {
		return commercial;
	}

	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}


	public RDV() {
		super();
	}
	
	
	public RDV(int id, Date date, Commercial commercial, Personne personne) {
		super();
		this.id = id;
		this.date = date;
		this.commercial = commercial;
		this.personne = personne;
	}
	
	public RDV(Date date) {
		super();
		this.date = date;
	}

	
	
	

	
	
	
	

}

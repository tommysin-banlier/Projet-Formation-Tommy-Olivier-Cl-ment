package com.intiFormation.entity;

import java.util.Date;

import javax.persistence.Entity;import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Formation {
	
	private int id;
	private String nom; 
	private float prix;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateFin;
	
	@ManyToOne
	@JoinColumn(name = "idFormateur")
	private Formateur formateur;
	

}

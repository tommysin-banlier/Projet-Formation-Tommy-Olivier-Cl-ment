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

@Entity
public class Historique {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern="dd/MM/yyyy")
 private Date date;
 
 private String commentaire;
 
@ManyToOne
@JoinColumn(name = "idUtilisateur")
 private Personne personne;
 @ManyToOne
 @JoinColumn (name="idCommercial")
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

public Historique(int id, Date date, String commentaire) {
	super();
	this.id = id;
	this.date = date;
	this.commentaire = commentaire;
}

public Historique() {
	super();
	// TODO Auto-generated constructor stub
}

public Historique(Date date, String commentaire) {
	super();
	this.date = date;
	this.commentaire = commentaire;
} 
 
	
	

}

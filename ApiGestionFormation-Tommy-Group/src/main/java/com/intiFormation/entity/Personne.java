package com.intiFormation.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="PERSONNE_TYPE")
@Table(name="PERSONNE")
public class Personne {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private int age;
	
	
	@OneToMany(mappedBy = "personne")
	@JsonIgnore
	private List<RDV> rdvs;
	
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) 
	{this.id = id;}
	public String getNom() 
	{return nom;}
	public void setNom(String nom) 
	{this.nom = nom;}
	public String getPrenom() 
	{return prenom;}
	public void setPrenom(String prenom) 
	{this.prenom = prenom;}
	public int getAge() 
	{return age;}
	public void setAge(int age) 
	{this.age = age;}
	
	
	public Personne(int id, String nom, String prenom, int age) 
	{
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Personne(String nom, String prenom, int age) 
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Personne() 
	{super();}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", age=" + age + "]";
	}
	
	
	
	
	

}

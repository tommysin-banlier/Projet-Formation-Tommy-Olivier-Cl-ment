package com.intiFormation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
//test


@Entity
public class Utilisateur extends Personne {

	private String username;
	private String password;
	
	@ManyToOne
	@JoinColumn(name="idRole")
	private Role role;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	public Utilisateur(int id, String nom, String prenom, int age, String username, String password, Role role) {
		super(id, nom, prenom, age);
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public Utilisateur(int id, String nom, String prenom, int age, String username, String password) {
		super(id, nom, prenom, age);
		this.username = username;
		this.password = password;
	}
	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(int id, String nom, String prenom, int age) {
		super(id, nom, prenom, age);
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Utilisateur [username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
	
	
	

}

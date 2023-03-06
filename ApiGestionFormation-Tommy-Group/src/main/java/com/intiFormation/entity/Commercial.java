package com.intiFormation.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Commercial")
public class Commercial extends Utilisateur{

	public Commercial(int id, String username, String password, Role role) {
		super(id, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Commercial(String username, String password, Role role) {
		super(username, password, role);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
